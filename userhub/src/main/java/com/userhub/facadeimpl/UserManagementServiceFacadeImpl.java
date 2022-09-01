package com.userhub.facadeimpl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.datahub.entities.shared.Permission;
import com.datahub.entities.users.Contact;
import com.datahub.entities.users.User;
import com.datahub.entities.users.UserProfile;
import com.shared.exceptions.BusinessException;
import com.shared.utils.IdGeneratorUtil;
import com.userhub.facade.UserManagementServiceFacade;
import com.userhub.messaging.MessagingService;
import com.userhub.messaging.messages.UserCreateMessage;
import com.userhub.messaging.messages.UserInviteMessage;
import com.userhub.model.LoggedInUser;
import com.userhub.model.requests.CreateInviteCodeRequest;
import com.userhub.model.requests.CreateUserRequest;
import com.userhub.model.requests.UpdateUserProfileRequest;
import com.userhub.model.response.CreateInviteCodeResponse;
import com.userhub.model.response.CreateUserResponse;
import com.userhub.model.response.UpdateUserResponse;
import com.userhub.service.UserAccountService;

@Component
public class UserManagementServiceFacadeImpl implements UserManagementServiceFacade {

	private UserAccountService userService;

	private Logger log = LoggerFactory.getLogger(getClass());

	private MessagingService userMessageService;

	@Autowired
	public UserManagementServiceFacadeImpl(UserAccountService userService, MessagingService userMessageService) {
		this.userService = userService;
		this.userMessageService = userMessageService;
	}

	@Override
	public CreateUserResponse createUser(CreateUserRequest req) throws BusinessException {

		req.validate();

		var temporaryPassword = IdGeneratorUtil.nextUUID();

		final User newUser = User.builder().firstName(req.getFirstName()).lastName(req.getLastName()).build();

		var userProfile = UserProfile.builder().emailAddress(req.getEmailAddress())
				.passwordSaltedHash(temporaryPassword) // set temporary password
				.stale(false).emailVerified(false).user(newUser).userName(req.getEmailAddress()).build();

		List<Contact> userContacts = req.getContacts().stream().map(c -> {
			Contact contact = Contact.builder().emailAddress(c.getEmailAddress())
					.isReferenceContact(c.isReferenceContact()).phoneNumber(c.getPhoneNumber()).build();
			contact.setUser(newUser);
			return contact;
		}).toList();

		newUser.setProfiles(new HashSet<>(Arrays.asList(userProfile)));
		newUser.setOwner(newUser.getId());
		newUser.setContacts(new HashSet<>(userContacts));

		var responseUser = userService.createUser(req.getInvitationCode(), newUser);

		var primaryContact = responseUser.getContacts().stream().filter(e -> !e.isReferenceContact()).findFirst();
		userMessageService.onNewUserRegister(
				UserCreateMessage.builder()
				.userId(responseUser.getId())
				.primaryEmail(primaryContact.get().getEmailAddress())
						.primaryPhoneNumber(primaryContact.get().getPhoneNumber()).build());
		
		return CreateUserResponse.builder()
				.userId(responseUser.getId())
				.invitationCode(req.getInvitationCode())
				.build();
	}

	@Override
	public UpdateUserResponse updateUserProfile(UpdateUserProfileRequest req) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public CreateInviteCodeResponse createInvite(CreateInviteCodeRequest req) throws BusinessException {
		req.validate();

		var prospectContact = Contact
				.builder()
				.emailAddress(req.getContact()
						.getEmailAddress())
				.phoneNumber(req.getContact()
						.getPhoneNumber())
				.build();

		var code = userService.createInviteCode(prospectContact);

		userMessageService.onNewUserInvite(UserInviteMessage
				.builder()
				.invitedBy(code.getOwnerUserId())
				.inviteCode(code.getInviteCode())
				.emailAddress(code.getSentToEmailAddress())
				.phoneNumber(code.getSentToPhoneNumber())
				.build());

		 return CreateInviteCodeResponse
				 .builder()
				 .id(code.getId())
				 .isSuccess(Objects.nonNull(code.getInviteCode()))
				 .build();
	}

	@Override
	public Optional<LoggedInUser> findByUsername(String username) {
		return this.userService.findByEmailAddress(username)
				 .map(user -> {
					 var activeProfile = user.getProfiles().stream().filter(profile -> profile.isStale()).findFirst();
					 return LoggedInUser.builder()
					  .userId(user.getId())
					  .emailAddress(activeProfile.get().getEmailAddress())
					  .isActive(activeProfile.get().isEmailVerified())
					  .passwordHash(activeProfile.get().getPasswordSaltedHash())
					  .userPermissions(user.getPermissions().stream().map(Permission::getPermission).toList())
					 .build();
				 });
	}

}
