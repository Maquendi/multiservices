package com.commerce.exceptions;

import lombok.Getter;

@Getter
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
	
}
