package com.datahub.entities.preferences;

import javax.persistence.Entity;

import com.datahub.utils.EntityBase;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemPreference extends EntityBase{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String preferenceName;
	
	private String preferenceValue;
}
