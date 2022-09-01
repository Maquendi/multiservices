package com.userhub.model.requests;


import lombok.Value;

@Value
public class CreateContactRequest {
	private String phoneNumber;
	private String emailAddress;
	private boolean isReferenceContact;
}
