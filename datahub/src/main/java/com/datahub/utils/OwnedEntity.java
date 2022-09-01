package com.datahub.utils;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

@MappedSuperclass
public abstract class OwnedEntity extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract String getOwnerUserId();
	
	@PrePersist
	public void beforePersist() {
		this.setOwner(getOwnerUserId());
	}
}
