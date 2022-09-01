package com.datahub.entities.commerce;

import java.time.ZonedDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.NotNull;

import com.datahub.entities.users.User;
import com.datahub.types.PayForMeRequestStatus;
import com.datahub.utils.EntityBase;
import com.datahub.utils.PayForMeRequestCompositePrimaryKey;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Data
@Entity
@IdClass(PayForMeRequestCompositePrimaryKey.class)
@EqualsAndHashCode(callSuper=true)
@Builder
public class ProductOrder extends EntityBase{
	
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * a number that's not unique and reference this entity/ this helps to keep track of requests that 
	 * are modified either to add or remove items while it's the same request but not yet approved or serviced.
	 */
	@Id
	private Long referenceNumber;
	
	/**
	 * who is this requestor ? usually same as userId but could be different, 
	 * it can be null in case this is an offer initited by the system and waiting for somebody to claim for it.
	 */
	private User recipient;
	
	/**
	 * This field is optional, only applies when a user tries to negociate an offer, requesting for a lower rate or a more money or longer time to payback.
	 */
	private String offerId;
	
	/**
	 * 
	 */
	private PayForMeRequestStatus status;
	
	/**
	 * 
	 */
	@NotNull
	private String productId;
	
	/**
	 * The exact dateTime when this event occurred.
	 */
	@NotNull
	@Builder.Default
	private ZonedDateTime createAt = ZonedDateTime.now();
	
	
	/*
	 * We don't want this field to be settable from outside
	 */
	@Setter(AccessLevel.PRIVATE)
	private String goodsJson;
	
	
	private int estimatedLiquidationDays;
}
