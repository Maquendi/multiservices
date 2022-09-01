package com.userhub.messaging;

import org.springframework.stereotype.Component;

import com.userhub.messaging.messages.UserCreateMessage;
import com.userhub.messaging.messages.UserInviteMessage;

@Component
public class KafkaUserMessageService implements MessagingService{

	
	
	
	
	
	@Override
	public void onNewUserRegister(UserCreateMessage message) {
		// should publish this message to a kafta new-user-registration-topic
	}

	@Override
	public void onNewUserInvite(UserInviteMessage message) {
		// TODO Auto-generated method stub
		
	}

}
