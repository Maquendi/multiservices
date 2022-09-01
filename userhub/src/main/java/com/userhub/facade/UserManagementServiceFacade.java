package com.userhub.facade;

import java.util.Optional;

import com.shared.exceptions.BusinessException;
import com.userhub.model.LoggedInUser;
import com.userhub.model.requests.CreateInviteCodeRequest;
import com.userhub.model.requests.CreateUserRequest;
import com.userhub.model.requests.UpdateUserProfileRequest;
import com.userhub.model.response.CreateInviteCodeResponse;
import com.userhub.model.response.CreateUserResponse;
import com.userhub.model.response.UpdateUserResponse;

public interface UserManagementServiceFacade {
   CreateUserResponse createUser(CreateUserRequest req) throws BusinessException;
   UpdateUserResponse updateUserProfile(UpdateUserProfileRequest req) throws BusinessException;
   
   CreateInviteCodeResponse createInvite(CreateInviteCodeRequest req) throws BusinessException;
   
   Optional<LoggedInUser> findByUsername(String username);
}
