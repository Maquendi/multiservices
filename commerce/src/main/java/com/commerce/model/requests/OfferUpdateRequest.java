package com.commerce.model.requests;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OfferUpdateRequest {
	private String offerId;
	private BigDecimal requestedAmount;
	private RateUpdateRequest rate;
}
