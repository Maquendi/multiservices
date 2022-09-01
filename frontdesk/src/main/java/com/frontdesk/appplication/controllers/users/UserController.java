package com.frontdesk.appplication.controllers.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shared.exceptions.BusinessException;
import com.userhub.facade.UserManagementServiceFacade;
import com.userhub.model.requests.CreateInviteCodeRequest;
import com.userhub.model.requests.CreateUserRequest;

@RestController
@RequestMapping("/users")
public class UserController {
	private Logger log = LoggerFactory.getLogger(getClass());
	private UserManagementServiceFacade userFacade;
	
	public UserController(UserManagementServiceFacade userFacade) {
		this.userFacade = userFacade;
		System.out.println("HELLO WORLD: " + userFacade);
	}
	
	
	@PostMapping()
	public ResponseEntity<?> registerUser(@RequestBody CreateUserRequest request) throws BusinessException{
		return ResponseEntity.ok(userFacade.createUser(request));
	}
	
	@PostMapping(value = "/inviteCode")
	public ResponseEntity<?> sendInvite(@RequestBody CreateInviteCodeRequest request) throws BusinessException {
		System.out.println("WHAT HAPPEEDEEDDD");
		log.debug("posting request: {}", request);
		return ResponseEntity.ok(
				userFacade.createInvite(request));
	}
}
