package com.commerce.types;


import lombok.Getter;

@Getter
public enum Errors {
	
  INSUFICIENT_PERMISSIONS(403, "Insuficient permissions");
	
	private int errorCode;
	private String description;

	Errors(int code, String descr){
		this.errorCode = code;
		this.description = descr;
	}
	
}
