package com.encora.collection;

import java.util.ArrayList;
import java.util.List;

public class Question_4 {
	public static void main(String[] args) {
		// Question 4 : Copy Elements of One Java Array List to Another Java
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		l1.add(5);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l2.addAll(l1);
		System.out.println(l1);
		System.out.println(l2);

	}

}
