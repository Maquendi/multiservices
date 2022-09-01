package com.commerce.facade;

import com.shared.exceptions.BusinessException;
import com.userhub.model.requests.CreateUserRequest;
import com.userhub.model.response.CreateUserResponse;

public interface CommerceUserServiceFacade  {

	Object getUser(String userId);
	CreateUserResponse createUser(CreateUserRequest userRequest) throws BusinessException;
}
