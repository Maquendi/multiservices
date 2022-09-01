package com.userhub.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.datahub.entities.users.Contact;
import com.datahub.entities.users.User;
import com.datahub.entities.users.UserConsent;
import com.datahub.entities.users.UserInviteCode;
import com.datahub.entities.users.UserProfile;
import com.shared.exceptions.BusinessException;
import com.userhub.service.UserAccountService;

@Component
public class UserAccountServiceImpl implements UserAccountService {

	@Override
	public Optional<UserConsent> getUserConsent(String userId) throws BusinessException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<User> findOne(String userId) throws BusinessException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<User> findByEmailAddress(String emailAddress) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Contact> findContact(String contactId) throws BusinessException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Contact> findUserContacts(String userId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(Long invitationCode, User newUser) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserProfile(UserProfile profile) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserPassword(String userId, String newPassword) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact updateContact(Contact contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInviteCode createInviteCode(Contact contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
