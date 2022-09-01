package com.shared.exceptions;

import com.shared.utils.Errors;

public class ResourceNotFoundException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super(Errors.RESOURCE_NOT_FOUND);
	}

}
