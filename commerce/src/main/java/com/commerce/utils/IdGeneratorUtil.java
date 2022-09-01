package com.commerce.utils;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;


public class IdGeneratorUtil {

	
	
	public static String nextUUID() {
		return UUID.randomUUID().toString();
	}
	
	public static Long nextPayForMeReferenceNumber() {
		
	  return (long) ThreadLocalRandom.current().nextInt(1, 1000000 + 1);
	}
	
	public static Long nextCashMeReferenceNumber() {
		
		  return (long) ThreadLocalRandom.current().nextInt(1, 1000000 + 1);
	 }
}
