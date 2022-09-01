package com.shared.exceptions;

import com.shared.utils.Errors;

public class OperationForbiddenException extends BusinessException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OperationForbiddenException() {
		super(Errors.FORBIDDEN);
		// TODO Auto-generated constructor stub
	}
	
	public OperationForbiddenException(String message) {
		super(Errors.FORBIDDEN.getErrorCode(), message);
		// TODO Auto-generated constructor stub
	}
}
