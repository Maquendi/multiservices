package com.datahub.entities.users;

import javax.persistence.Entity;

import com.datahub.utils.OwnedEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInviteCode extends OwnedEntity{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long inviteCode;

	private boolean isRedeemed;
	
	private String sentToPhoneNumber;
	
	private String sentToEmailAddress;
	
	private boolean revoked;
	
	public String getIssuer() {
		return this.getOwner();
	}

	@Override
	public String getOwnerUserId() {
		return getIssuer();
	}
}
