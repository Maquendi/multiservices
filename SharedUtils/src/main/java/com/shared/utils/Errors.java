package com.shared.utils;



public enum Errors {
	
  INSUFICIENT_PERMISSIONS(403, "Insuficient permissions"),
  MISSING_ARGUMENT(400, "Insuficient permissions"),
  FORBIDDEN(403, "Forbidden"),
  INVALID_REQUEST(400, "Bad request"),
  RESOURCE_NOT_FOUND(404, "resource not found"),
  NOT_AUTHORIZED(401, "not authorized");
	
	private final int errorCode;
	private final String description;

	Errors(int code, String descr){
		this.errorCode = code;
		this.description = descr;
	}

	public int getErrorCode() {
		return errorCode;
	}


	public String getDescription() {
		return description;
	}

}
