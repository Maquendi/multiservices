package com.commerce.constants;

import java.util.function.Supplier;

import com.commerce.exceptions.BusinessException;
import com.commerce.types.ICallback;


public class Constants {
  public static final String PAY_FOR_ME_OFFER_GENERATOR_PROCESS = "Offer_generator_batch";
  
  public static final String ADMIN_ORDER_CREATE = "admin:order:create";
  public static final String ORDER_CREATE = "order:create";
  public static final String ADMIN_OFFER_RATE_UPDATE = "admin:offer:rate:update";
  public static final String ADMIN_OFFER_RATE_EXPIRY_UPDATE = "admin:offer:rateexpiry:update";
  public static final String ADMIN_OFFER_AMOUNT_UPDATE = "admin:offer:amount:update";
  
  
  
  public static void assertBoom(boolean predicate, Supplier<?> supplier) {
	  if (!predicate) {
		  supplier.get();
	  }
  }
  
	public static <E> E ifTrueElse(boolean predicate, Supplier<E> supplier, Supplier<E> elseSupplier) throws BusinessException {
		if (predicate) {
			return supplier.get();
		}
		return elseSupplier.get();
	}
	
	public static void ifTrueElse(boolean predicate, ICallback cb1, ICallback cb2) throws BusinessException {
		if (predicate) {
			cb1.execute();
		}
		cb2.execute();
	}
}
