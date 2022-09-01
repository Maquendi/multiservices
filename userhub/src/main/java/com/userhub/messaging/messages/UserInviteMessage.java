package com.userhub.messaging.messages;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserInviteMessage {
	private Long inviteCode;
	private String invitedBy;
	private String emailAddress;
	private String phoneNumber;
}
