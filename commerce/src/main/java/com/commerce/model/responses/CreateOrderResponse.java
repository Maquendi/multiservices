package com.commerce.model.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateOrderResponse {
	
	// must be generated first time a request is posted to create an order.
	private String orderId;
    private RateUpdateResponse rate;
	private boolean canChangeRate; // determines if user can have the option to request a higher amount, a lower interest rate or a bigger day count.
}
