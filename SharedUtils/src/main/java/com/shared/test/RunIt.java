package com.shared.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunIt {

	private static Logger logger = LoggerFactory.getLogger(RunIt.class);
	
	public static void main(String args[]) {
//		logger.debug("res: {} ", getFirstUnrepeatedCharIndex("Hola mulmnrndaoH rd"));
//		logger.info("res: {} ", getFirstUnrepeatedCharIndex("friedchicken"));
//		logger.info("res: {} ", getFirstUnrepeatedCharIndex("Hola kelokeHntoki rd"));
		
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
		
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1,5,3,7,6));
		
		//boolean union = set1.addAll(set2);
		
		System.out.println(set1);
		
		//var intersection = set1.retainAll(set2);
		
		//System.out.println(set1);
		
		var diff = set2.removeAll(set1);
		System.out.println(set2);
	}
	
	
	
	
	
	
	
	
	public static int getFirstUnrepeatedCharIndex(String s) {
		Map<String, Integer> helper = new LinkedHashMap<>();
		String[] arr = s.replace(" ", "").split("");
		
		for (int i=0; i < arr.length; i++) {
			 String key = arr[i];
			 Integer value = helper.get(key);
			 if (Objects.nonNull(value)) {
				 value++;
				 helper.put(key, value);
			 } else {
				 helper.put(key, 1);
			 }
		}
		
		System.out.println(helper);
		
		String firstNonRepeated = null;
		int indexCount = 0;
		for (Entry<String, Integer> entry : helper.entrySet()) {
			 if (Objects.nonNull(entry.getValue()) && entry.getValue().equals(1)) {
				 indexCount++;
				 if (indexCount == 2) {
					 firstNonRepeated = entry.getKey();
					 break; 
				 }
			 }	
		}	

		if (Objects.nonNull(firstNonRepeated)) {
			int foundIndex =  s.indexOf(firstNonRepeated);
			
			if (foundIndex != -1) 
				 return foundIndex + 1;
		}
	
		return -1;
	}
	
	
}
