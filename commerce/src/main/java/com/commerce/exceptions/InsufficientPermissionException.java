package com.commerce.exceptions;

import static com.commerce.types.Errors.INSUFICIENT_PERMISSIONS;

import lombok.Getter;

@Getter
public class InsufficientPermissionException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientPermissionException() {
		super(INSUFICIENT_PERMISSIONS.getErrorCode(), INSUFICIENT_PERMISSIONS.getDescription());
		// TODO Auto-generated constructor stub
	}

}
