package com.commerce.exceptions;

import lombok.Getter;

@Getter
public abstract class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	public BusinessException(int code, String message) {
		super(message);
		this.code = code;
	}
}
