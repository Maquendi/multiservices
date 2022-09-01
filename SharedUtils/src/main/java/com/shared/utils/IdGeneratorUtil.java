package com.shared.utils;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class IdGeneratorUtil {

	
	
	public static String nextUUID() {
		return UUID.randomUUID().toString();
	}
	
	
	public static Long nextLong() {
		return (long) ThreadLocalRandom.current().nextInt(1, 1000000 + 1);
	}
}
