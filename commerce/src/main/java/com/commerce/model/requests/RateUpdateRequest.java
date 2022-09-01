package com.commerce.model.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RateUpdateRequest {
	protected Float requestedRate;
	protected Integer requestedInterestRateValidDaysCount;  
}
