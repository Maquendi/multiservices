package com.commerce.model.responses;

import com.commerce.model.requests.RateUpdateRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
public class RateUpdateResponse extends RateUpdateRequest {
	private String rateKey;
	private boolean reEvaluated;
	
	public RateUpdateResponse(float interestRate, int interestRateValidDaysCount, String rateKey, boolean reEvaluated) {
		super(interestRate, interestRateValidDaysCount);
		this.rateKey = rateKey;
		this.reEvaluated = reEvaluated;
	}
}
