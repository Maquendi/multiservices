package com.shared.exceptions;

import com.shared.utils.Errors;

public class MissingArgumentException extends BusinessException {

	public MissingArgumentException() {
		super(Errors.MISSING_ARGUMENT);
	}
	
	
	public MissingArgumentException(String message) {
		super(Errors.MISSING_ARGUMENT.getErrorCode(), message);
	}
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
