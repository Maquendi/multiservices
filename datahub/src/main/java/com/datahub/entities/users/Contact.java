package com.datahub.entities.users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.datahub.utils.EntityBase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contact extends EntityBase{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String phoneNumber;
	private String emailAddress;
	private boolean isReferenceContact; // if this is a contact that belongs to a reference for a user.
	
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private User user;
	
	private boolean isVerfied;
	
	public void setUser(User user) {
		this.user = user;
		this.setOwner(user.getId());
	}
}
