package com.commerce.model.requests;


import java.util.Objects;

import com.commerce.exceptions.RequestValidationException;

import lombok.Data;

@Data
public abstract class CreateOrderRequest {
 
	private String productId;
	
	private String recipientId;
	
	private String offerId;
	
	private int payBackExpiryDays;
	
	private OfferUpdateRequest offerUpdate; // nullable
	
	private String userConsentCode; // optional parameter, but required if an admin is placing an orderRequest on behalf of a customer/user. that code was emailed or texted to the user
	
	//public abstract <E extends ProductOrderDto> E createOrder() throws RequestValidationException;
	
	public void validateRequest() throws RequestValidationException {
//		if (Objects.nonNull(offerId)) {
//			 assertBoom(Objects.nonNull(offerUpdate), ()-> new RequestValidationException("offerId provided but no offerUpdate request present"));
//		}
		
	}
	
	public boolean isOfferUpdateRequested() {
		return Objects.nonNull(offerId) && Objects.nonNull(offerUpdate);
	}
}


