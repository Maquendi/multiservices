package com.datahub.types;

public enum PayForMeRequestStatus {
	PENDING, 
	DENIED, 
	APPROVED,
	PRE_APPROVED,
	/**
	 * The request has been approved already and money given to the requestor/ or the good has been paid for already.
	 */
	SERVICED, 
	CANCELLED, 
	IN_REVISION;
}
