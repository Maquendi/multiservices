package com.shared.utils;

import java.util.function.Supplier;

import com.shared.exceptions.BusinessException;


public class UtilFuntions {

	
	  public static <X extends Throwable> void assertBoom(boolean predicate, Supplier<? extends X> exceptionSupplier) throws X {
		  if (!predicate) {
			  throw exceptionSupplier.get();
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
