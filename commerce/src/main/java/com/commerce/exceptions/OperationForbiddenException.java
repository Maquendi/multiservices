package com.commerce.exceptions;

import lombok.Getter;

@Getter
public class OperationForbiddenException extends BusinessException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OperationForbiddenException() {
		super(403, "Forbidden");
		// TODO Auto-generated constructor stub
	}
	
	public OperationForbiddenException(String message) {
		super(403, message);
		// TODO Auto-generated constructor stub
	}

}
