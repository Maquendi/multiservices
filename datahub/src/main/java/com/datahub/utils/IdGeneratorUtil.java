package com.datahub.utils;

import java.util.UUID;

public class IdGeneratorUtil {

	
	
	public static String nextUUID() {
		return UUID.randomUUID().toString();
	}
	
	
	public static Long nextLong() {
		return 1L;
	}
}
