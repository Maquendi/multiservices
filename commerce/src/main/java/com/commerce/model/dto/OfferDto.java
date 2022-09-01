package com.commerce.model.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OfferDto {
	
	private String offerId;
	
	private String offerName;

	private String offerDescription;

	private LocalDateTime createdAt;

	private int maxTurnDown;

	private boolean isRecurringDaily;

	private boolean isActive;

	private String productId;

	private BigDecimal offerAmount;

	private float interestRate;

	private int interestRateValidDaysCount;

	private boolean canChangeSpecs;

	private Set<String> targetUsers;
	
}
