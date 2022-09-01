package com.commerce.exceptions;

import lombok.Getter;

@Getter
public class MissingArgumentException extends BusinessException {

	public MissingArgumentException(String message) {
		super(400, message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
