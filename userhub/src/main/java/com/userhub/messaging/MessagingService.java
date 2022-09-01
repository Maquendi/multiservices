package com.userhub.messaging;

import com.userhub.messaging.messages.UserCreateMessage;
import com.userhub.messaging.messages.UserInviteMessage;

public interface MessagingService {
  public void onNewUserRegister(final UserCreateMessage message);
  public void onNewUserInvite(final UserInviteMessage message);
} 
