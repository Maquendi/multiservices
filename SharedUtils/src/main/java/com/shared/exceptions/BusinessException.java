package com.shared.exceptions;

import com.shared.utils.Errors;

public abstract class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int code;
	public BusinessException(Errors error) {
		super(error.getDescription());
		this.code = error.getErrorCode();
	}
	
	public BusinessException(int code, String message) {
		super(message);
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}	
}
