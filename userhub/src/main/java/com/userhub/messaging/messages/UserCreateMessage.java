package com.userhub.messaging.messages;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserCreateMessage {
  private String userId;
  private String primaryEmail;
  private String primaryPhoneNumber;
}
