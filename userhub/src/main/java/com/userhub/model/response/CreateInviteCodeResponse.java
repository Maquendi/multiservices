package com.userhub.model.response;

import com.userhub.model.requests.CreateInviteCodeRequest;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateInviteCodeResponse extends CreateInviteCodeRequest {
 private boolean isSuccess;
 private String id;
}
