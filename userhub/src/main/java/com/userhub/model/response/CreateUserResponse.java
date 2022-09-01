package com.userhub.model.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateUserResponse {
 
	private Long invitationCode;
	
	private String userId;
}
