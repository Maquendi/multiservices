package com.commerce.messaging;

import java.math.BigDecimal;
import java.util.function.Function;

import com.commerce.model.dto.OfferDto;
import com.commerce.model.message.OfferMessage;

public class OfferProducer {

	
	// post this into a kafka topic, from where it can be consumed by another ms app
	// that will push the
	// notification to the user.
	public void sendOffer(final OfferDto offer) {
		this.sendOffer(offer, (id) -> offer.getOfferAmount());
	}

	public void sendOffer(final OfferDto offer, Function<String, BigDecimal> maxAmountPerUserFunc) {
		OfferMessage message = OfferMessage
				.builder()
				.maxUserTurnDown(offer.getMaxTurnDown())
				.offerId(offer.getOfferId())
				.id(offer.getOfferId())
				.build();

		offer.getTargetUsers().forEach(userId -> {
			message.getUserMaxAmounts().add(new OfferMessage.UserMaxAmount(userId, maxAmountPerUserFunc.apply(userId)));
		});

		this.sendMessage(message);
	}

	private void sendMessage(OfferMessage offerMessage) {
		// here you send it to the appropriate kafka topic or any other messagin system.
	}
	
}
