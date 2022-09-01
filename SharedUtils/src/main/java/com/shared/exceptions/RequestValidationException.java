package com.shared.exceptions;

import com.shared.utils.Errors;

public class RequestValidationException extends BusinessException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RequestValidationException() {
		super(Errors.INVALID_REQUEST);
		// TODO Auto-generated constructor stub
	}
	
	public RequestValidationException(String message) {
		super(Errors.INVALID_REQUEST.getErrorCode(), message);
		// TODO Auto-generated constructor stub
	}

}
