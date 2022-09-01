package com.datahub.entities.commerce;

import java.time.LocalDateTime;
import javax.persistence.Entity;

import com.datahub.utils.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Product extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String name;
	
	private boolean active;

	private String description;
	
	private LocalDateTime createdAt = LocalDateTime.now();
	
	private LocalDateTime updatedAt;
	
	private String productOwner;
}
