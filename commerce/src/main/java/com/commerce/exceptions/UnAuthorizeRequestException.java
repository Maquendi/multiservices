package com.commerce.exceptions;

import lombok.Getter;

@Getter
public class UnAuthorizeRequestException extends BusinessException{


	public UnAuthorizeRequestException() {
		super(401, "Not authorized");
		// TODO Auto-generated constructor stub
	}
	
	public UnAuthorizeRequestException(String message) {
		super(401, message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
