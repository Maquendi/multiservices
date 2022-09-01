package com.datahub.utils;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import com.datahub.shared.IdentifiableResource;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class EntityBase implements Serializable, IdentifiableResource{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	public EntityBase() {
		this.setId(IdGeneratorUtil.nextUUID());
		this.setCreatedAt(LocalDateTime.now());
		this.setUpdatedAt(LocalDateTime.now());
		this.setOwner(this.getId());
	}

	@NotNull
	private String owner; // the user who created or modified this record.

	@NotNull
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
