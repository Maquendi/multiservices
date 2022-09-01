package com.commerce.model.message;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateOfferMessage {
 private String requestorId;
 private String offerId;
 private BigDecimal requestedAmount;
 private float requestedRate;
 private int requestedInterestRateValidDaysCount;  
}
