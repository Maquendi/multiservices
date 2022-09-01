package com.userhub.model.requests;

import java.util.List;
import java.util.Objects;
import com.shared.exceptions.BusinessException;
import com.shared.exceptions.RequestValidationException;
import static com.shared.utils.UtilFuntions.assertBoom;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateUserRequest {

	private String firstName;
	private String lastName;
	private String emailAddress;
	private Long invitationCode;
	
	private List<CreateContactRequest> contacts;
	
	public void validate() throws BusinessException {
       assertBoom(Objects.nonNull(contacts), ()-> new RequestValidationException("needs contacts"));
       assertBoom(contacts.size() >= 3 , ()->  new RequestValidationException("needs at least 3 contacts"));
	}
}
