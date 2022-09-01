package com.datahub.entities.commerce;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.datahub.utils.EntityBase;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class InterestRate extends EntityBase{/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	
	private float rate;
	
	private int interestRateValidDaysCount;
	
	private boolean isAdminRate; // if this rate was applied to a sale because a user requested or it was assigned by an admin.
	
	@ManyToOne
	@JoinColumn(name="sale_id", nullable=false)
	private Sale sale; // the sale this rate was applied to ?
}
