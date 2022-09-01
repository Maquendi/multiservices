package com.commerce.facadeimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.commerce.facade.CommerceUserServiceFacade;
import com.shared.exceptions.BusinessException;
import com.userhub.facade.UserManagementServiceFacade;
import com.userhub.model.requests.CreateUserRequest;
import com.userhub.model.response.CreateUserResponse;

@Component
public class CommerceUserServiceFacadeImpl implements CommerceUserServiceFacade {

	private UserManagementServiceFacade userFacade;
	
	@Autowired
	public CommerceUserServiceFacadeImpl(UserManagementServiceFacade userFacade) {
		this.userFacade = userFacade;
	}

	@Override
	public Object getUser(String userId) {
		// TODO Auto-generated method stub
//		Optional<String> theUser = userFacade.getUser(userId);
//		if (theUser.isPresent()) {
//			return theUser.get();
//		}
		return "Oopsss could not fetch the user";
	}

	@Override
	public CreateUserResponse createUser(CreateUserRequest userRequest) throws BusinessException {		
		return userFacade.createUser(userRequest);
	}
}
