package com.userhub.service;

import com.datahub.shared.IdentifiableResource;
import com.shared.exceptions.UnAuthorizeRequestException;
import com.userhub.model.LoggedInUser;

public interface AuthorizerService {
	void canUpdate(IdentifiableResource resource) throws UnAuthorizeRequestException;

	void canDelete(IdentifiableResource resource) throws UnAuthorizeRequestException;

	void canCreate(IdentifiableResource resource) throws UnAuthorizeRequestException;

	LoggedInUser currentUser() throws UnAuthorizeRequestException;
}
