package com.datahub.utils;

import java.io.Serializable;

import lombok.Data;

@Data
public class PayForMeRequestCompositePrimaryKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private Integer referenceNumber;
}
