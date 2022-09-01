package com.datahub.entities.commerce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Entity;

import com.datahub.utils.AbstractOffer;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * A way for authorized super admin users to create offers on the fly.
 * @author Maquendi B. Novas
 *
 */

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Offer extends AbstractOffer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String offerName;
	
	private String offerDescription;
	
	private LocalDateTime createdAt;
	
	private int maxTurnDown;
	
	private boolean isRecurringDaily; // is an offer that should be posted to eligible users on a daily basis ?
	
	private boolean isActive;
	
	private String productId;	
	
	private BigDecimal offerAmount; // how much money should that offer.
	
	private float interestRate; // offer interest rate.
	
	private int interestRateValidDaysCount; // amount of days this rate is valid for, if not paid another rate will be applied. 
	
	private boolean canChangeSpecs; // determines if user can have the option to request a higher amount, a lower interest rate or a bigger day count.
	
	/**
	 
	  {
	    id: "s4der-8521e-85s-1204x",
	    offerName: "Buen provecho",
	    offerDescription: "Sabias que en tal negocio ya estan listo para servirte el mejor plato del dia ?  Cuentas con la aprobacion de  500 para consumo a una tasa de 0.45% para pagar en un maximo de 20 dias",
	    isRecurringDaily: true,
	    isActive: true,
	    productId: "001200" // the id of PayForMe product
	    maxTurnDown: 3,
	    amount: 500.00,
	    interestRate: 0.45,
	    rateValidDaysCount: 20,
	    canChangeSpecs: true
	  }
	
	 */
}
