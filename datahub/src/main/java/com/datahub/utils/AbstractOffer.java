package com.datahub.utils;

import java.util.Objects;
import java.util.Set;

public abstract class AbstractOffer extends EntityBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Set<String> toSet(String source) {
		final String SPLITTER = ",";
		if (Objects.isNull(source))
			return Set.of();
	   return Set.of(source.split(SPLITTER));
	}
}
