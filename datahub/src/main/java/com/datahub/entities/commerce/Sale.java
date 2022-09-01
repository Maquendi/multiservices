package com.datahub.entities.commerce;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.datahub.utils.EntityBase;

import lombok.Data;
import lombok.EqualsAndHashCode;



@Entity(name="sale")
@Data
@EqualsAndHashCode(callSuper=true)
public class Sale extends EntityBase{
	/**
	 * 
	 */
	private Long referenceNumber; // numero de referencia de la venta.
	private static final long serialVersionUID = 1L;
	@NotNull
	private String userId; // el usuario a quien se vendio, notNullable
	@NotNull
	private String productId;
	private String offerId;
	private BigDecimal investedAmount; // 
	
	@OneToMany(mappedBy = "sale")
	private List<InterestRate> interestRates; // when the system recalculates the totalAmount for a sale, it'll generate a new interest rate and persist it to that table.
	
	
}
