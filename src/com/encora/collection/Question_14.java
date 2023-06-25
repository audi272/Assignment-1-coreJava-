package com.encora.collection;

import java.util.HashMap;
import java.util.Map;

public class Question_14 {
	public static void main(String[] args) {
		// Question 14 : Remove value from Java HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("Ajay", 44);
		map.put("Prafull", 55);
		map.put("Amar", 22);
		map.put("Vrushabh", 11);
		
		map.remove("Amar");
		System.out.println("After removing value : "+map);

	}

}
