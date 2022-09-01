package com.shared.utils;

public enum UserActions {
	UPDATE("update"), CREATE("create"), DELETE("delete");

	private String action;

	UserActions(String name) {
		this.action = name;
	}

	public String getAction() {
		return action;
	}

}
