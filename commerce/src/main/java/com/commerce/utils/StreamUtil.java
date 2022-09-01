package com.commerce.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamUtil {

	public static class SplittableStream<T> {
		List<T> chunk1;
		List<T> chunk2;
		List<T> datasource;

		public SplittableStream(List<T> datasource) {
			this.chunk1 = new ArrayList<>();
			this.chunk2 = new ArrayList<>();
			this.datasource = datasource;
		}

		public SplittableStream<T> split(Predicate<T> splitPredicate) {
			this.datasource.forEach(d -> {
				if (splitPredicate.test(d)) {
					this.chunk1.add(d);
				} else {
					this.chunk2.add(d);
				}
			});
			return this;
		}
		
		public SplittableStream<T> chunk1(Consumer<List<T>> consumer) { 
			consumer.accept(chunk1);
			return this;
		}
		
		public SplittableStream<T> chunk2(Consumer<List<T>> consumer) {
			consumer.accept(chunk2);
			return this;
		}
		
	}

	public static <T> SplittableStream<T> source(List<T> dataSource) {
		return new SplittableStream<T>(dataSource);
	}

}
