package com.userhub.model.requests;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UpdateUserProfileRequest {
  private String userId;
  private String fistName;
  private String lastName;
}
