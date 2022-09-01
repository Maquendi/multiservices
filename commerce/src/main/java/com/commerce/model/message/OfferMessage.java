package com.commerce.model.message;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;






@Data
@Builder
public class OfferMessage {
	private String id;
	private String offerId;
	private int maxUserTurnDown;
	@Builder.Default
	private List<UserMaxAmount> userMaxAmounts  = new ArrayList<>();

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class UserMaxAmount {
		String recipientUserId;
		BigDecimal maxAmountApplicable;
	}

}

