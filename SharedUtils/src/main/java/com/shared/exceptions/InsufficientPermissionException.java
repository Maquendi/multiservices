package com.shared.exceptions;

import com.shared.utils.Errors;

public class InsufficientPermissionException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientPermissionException() {
		super(Errors.INSUFICIENT_PERMISSIONS);
		// TODO Auto-generated constructor stub
	}

}
