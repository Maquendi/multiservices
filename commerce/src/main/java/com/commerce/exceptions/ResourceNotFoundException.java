package com.commerce.exceptions;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		super(404, message);
	}

}
