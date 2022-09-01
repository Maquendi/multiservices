package com.datahub.types;

public enum OfferEligibilityOptions {
	
	IS_FALSE(0), IT_TRUE(1), _INDIFFERENT(2);
	
	private Integer option;
	
	OfferEligibilityOptions(Integer value){
		this.option = value;
	}
	
	public boolean isTrue() {
		return this.option.equals(1);
	}
	
	public boolean isFalse() {
		return this.option.equals(0);
	}
	
	public boolean isIndifferent() {
		return this.option.equals(2);
	}
}
