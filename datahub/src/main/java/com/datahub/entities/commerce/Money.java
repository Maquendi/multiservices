package com.datahub.entities.commerce;

import java.math.BigDecimal;

import javax.persistence.Entity;

import com.datahub.utils.EntityBase;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Money extends EntityBase {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private BigDecimal globalTotalAmount;
  private float maxInvestmentPercentage;
}
