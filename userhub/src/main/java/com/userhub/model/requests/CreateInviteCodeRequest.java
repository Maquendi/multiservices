package com.userhub.model.requests;

import java.util.Objects;

import com.shared.exceptions.BusinessException;
import com.shared.exceptions.RequestValidationException;
import com.shared.utils.UtilFuntions;

import lombok.Data;

@Data
public class CreateInviteCodeRequest {	
	private CreateContactRequest contact;
	
	public void validate() throws BusinessException{
		UtilFuntions.assertBoom(Objects.nonNull(contact), () -> new RequestValidationException("contact is required"));
		UtilFuntions.assertBoom(Objects.nonNull(contact.getPhoneNumber()), () -> new RequestValidationException("Phone number is required"));
		UtilFuntions.assertBoom(Objects.nonNull(contact.getEmailAddress()), () -> new RequestValidationException("email is required"));
	}
}
