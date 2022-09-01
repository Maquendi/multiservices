package com.shared.exceptions;

public class AssertionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int errorCode;
	public AssertionException(String message, int code) {
		super(message);
		this.errorCode = code;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
}
