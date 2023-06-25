package com.encora.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Question_9 {
	public static void main(String[] args) {
		// Question 9 : Get Synchronized Map from Java HashMap
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Rahul", 11);
		map.put("Kamal", 22);
		map.put("Vijay", 33);
		map.put("Kundan", 44);
		Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);
		System.out.println(synchronizedMap);

	}

}
