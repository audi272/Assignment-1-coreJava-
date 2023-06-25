package com.encora.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_8 {
	public static void main(String[] args) {
		// Question 8 : Get Synchronized List from Java Array List
		List<String> l1 = new ArrayList<>();
		l1.add("Ajay");
		l1.add("Vijay");
		l1.add("Sanjay");
		l1.add("Atul");

		List<String> synchronizedList = Collections.synchronizedList(l1);
		System.out.println(synchronizedList);

	}

}
