package com.datahub.entities.commerce;


import java.util.Set;
import javax.persistence.Entity;

import com.datahub.types.OfferEligibilityOptions;
import com.datahub.utils.AbstractOffer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Determines the criterias that make a user eligible for an offer.
 * @author Maquendi B. Novas
 *
 */
@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class OfferEligibilityCriteria extends AbstractOffer {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// CUAL SERIA UNA LISTA DE FACTORES QUE PODRIAN HACER QUE UN USUARIO SEA ELEGIBLE PARA UNA OFERTA ?
	/**
	 * 1)  que sea nuevo,
	 * 2)  que haya completado x cantidad de operaciones
	 * 3)  la frecuencia de sus operaciones
	 * 4)  la frecuencia con que paga
	 * 5)  esta activa la cuenta del usuario ?
	 * 6)  el usuario debe actualmente ??
	 * 7)  Que tenga x cantidad de tiempo
	 * 8)  Que ofertas a aceptado anteriormente.
	 * 9)  que la oferta aplica solo para un merchant especifico o un grupo de merchants
	 */


	private OfferEligibilityOptions targetNewUsers; //  considered if value is true or false otherwise not considered.
	
	private Integer operationFrecuency; // frecuencia a la realiza operaciones, if one is provided it's considered otherwise not applied.
	
	private Integer amountOfOperationsCompleted; // check operations that have been completed/paid and paidback;
	
	private OfferEligibilityOptions userAccountIsActive;
	
	private Integer hasBeenWithUsForLessThan; // only considered is not null.
	
	private Integer hasBeenWithUsForMoreThan; // only considered is not null.
	
    private String offerSettingId;
	
	private String operationsCompleted;
	
	private OfferEligibilityOptions userCurrentlyOwe; // if user currently owing matters o not
	
	@Getter(value = AccessLevel.PRIVATE)
	private String targetInstitutionIds; // a list of schools who's students this offer will go to. // null if offer does not care about a school.
	
	@Getter(value = AccessLevel.PRIVATE)
	private String targetMerchantIds; // a list of merchants who's customers this offer will go to. // null if offer does not care about a merchant.
	
	@Getter(value = AccessLevel.PRIVATE)
	private String targetUsersIds; // contains all user ids as in comma separated string, only if this offer is targetted to preselected users (preselected by admin).
	
	public Set<String> targetInstitutionIds() {
		return this.toSet(targetInstitutionIds);
	}
	
	public Set<String> targetMerchantIds() {
		return this.toSet(targetMerchantIds);
	}
	
	public Set<String> targetUserIds() {
		return this.toSet(targetUsersIds);
	}
	
}
