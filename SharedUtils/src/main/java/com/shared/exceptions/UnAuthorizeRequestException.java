package com.shared.exceptions;

import com.shared.utils.Errors;
public class UnAuthorizeRequestException extends BusinessException{


	public UnAuthorizeRequestException() {
		super(Errors.NOT_AUTHORIZED);
		// TODO Auto-generated constructor stub
	}
	
	public UnAuthorizeRequestException(String message ) {
		super(Errors.NOT_AUTHORIZED.getErrorCode(), message);
	}
	private static final long serialVersionUID = 1L;

}
