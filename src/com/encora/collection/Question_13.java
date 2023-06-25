package com.encora.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Question_13 {
	public static void main(String[] args) {
		// Question 13 : Iterate through the values of Java HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("Ajay", 44);
		map.put("Prafull", 55);
		map.put("Amar", 22);
		map.put("Vrushabh", 11);
		Collection<Integer> values = map.values();
		for (Integer val : values) {
			System.out.println("Value of map is : "+val);
		}

	}

}
