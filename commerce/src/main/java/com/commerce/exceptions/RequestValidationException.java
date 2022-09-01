package com.commerce.exceptions;

public class RequestValidationException extends BusinessException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RequestValidationException(String message) {
		super(400, message);
		// TODO Auto-generated constructor stub
	}

}
