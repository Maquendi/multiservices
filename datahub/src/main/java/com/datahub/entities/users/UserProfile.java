package com.datahub.entities.users;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.datahub.utils.OwnedEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile extends OwnedEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String userName;
	
	@NotNull
	private String passwordSaltedHash;
	
	@NotNull
	private String emailAddress;
	private boolean emailVerified;
	
	private boolean stale; // when true this record is the current user profile, when false it means the user has changed it so it will eventually disappear.
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable=false)
	private User user;

	@Override
	public String getOwnerUserId() {
		return this.user.getId();
	}
}
