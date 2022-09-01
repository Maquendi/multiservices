package com.commerce.model.responses;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OfferUpdateResponse {
	private boolean pendingEvaluation;
	private BigDecimal offerAmount; // should only show in response when not null
	private RateUpdateResponse offerRate; // should only show in response when not null
	private boolean reEvaluated;
}
