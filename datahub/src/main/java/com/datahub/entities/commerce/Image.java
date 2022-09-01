package com.datahub.entities.commerce;

import javax.persistence.Entity;

import com.datahub.utils.EntityBase;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Image extends EntityBase{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	private String s3Reference;
	
	private String ownerReference;
}
