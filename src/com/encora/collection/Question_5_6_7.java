package com.encora.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;

public class Question_5_6_7 {
	public static void main(String[] args) {
		// Question 5 : Find Minimum element of Java Array List

		List<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		System.out.println("Minimum no in list is :" + Collections.min(l1));

		// Question 6: Find maximum element of Java HashSet

		HashSet<Integer> set = new HashSet<>();
		set.add(5);
		set.add(10);
		set.add(15);
		set.add(20);
		System.out.println("Maximum no in set is :" + Collections.max(set));

		// Question 7 : Get Enumeration over Java Array List

		Enumeration<Integer> enumeration = Collections.enumeration(l1);
		while (enumeration.hasMoreElements()) {
			int element = enumeration.nextElement();
			System.out.println(element);

		}

	}

}
