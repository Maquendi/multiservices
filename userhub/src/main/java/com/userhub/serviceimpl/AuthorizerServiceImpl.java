package com.userhub.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.datahub.shared.IdentifiableResource;
import com.shared.exceptions.UnAuthorizeRequestException;
import com.shared.utils.UserActions;

import static com.shared.utils.UtilFuntions.assertBoom;

import java.util.List;

import com.userhub.model.LoggedInUser;
import com.userhub.service.AuthorizerService;

@Component
public class AuthorizerServiceImpl implements AuthorizerService {
	
	private Logger log  = LoggerFactory.getLogger(getClass());

	@Override
	public void canUpdate(IdentifiableResource resource) throws UnAuthorizeRequestException {
		validate(UserActions.UPDATE, resource, false);
	}

	@Override
	public void canDelete(IdentifiableResource resource) throws UnAuthorizeRequestException {
		this.validate(UserActions.DELETE, resource, true);
	}

	@Override
	public void canCreate(IdentifiableResource resource) throws UnAuthorizeRequestException {
		this.validate(UserActions.CREATE, resource, true);
	}

	
	@Override
	public LoggedInUser currentUser() throws UnAuthorizeRequestException {
		
		return LoggedInUser
		.builder()
		.isActive(true)
		.userId("575a8d0a-2863-11ed-a261-0242ac120002")
		.userPermissions(List.of("user:userinvitecode:create"))
		.build();
	}

	private void validate(UserActions action, IdentifiableResource resource, boolean requiresUserPermission)
			throws UnAuthorizeRequestException {
		String resourceName = getResourceName(resource);
		LoggedInUser currentUser = currentUser();
		System.out.println("Current user: changing {}" + currentUser);
		if (currentUser.getUserId().equals(resource.getOwner())) {
			if (requiresUserPermission) {
				String requiredPermisson = "user:" + resourceName + ":" + action.getAction();
				System.out.println("requiredPermisson: " + requiredPermisson);
				assertBoom(currentUser.isAuthorized(requiredPermisson), () -> new UnAuthorizeRequestException("Permission required to " + action.getAction() + " " + resourceName));
			}
		} else {
			String requiredPermisson = "admin:" + resourceName + ":" + action.getAction();
			assertBoom(currentUser.isAuthorized(requiredPermisson), () -> new UnAuthorizeRequestException());
		}
	}
	
	public void authorize() {
		
		
	}

	private String getResourceName(IdentifiableResource resource) {
		return resource.getClass().getSimpleName().toLowerCase();
	}

}
