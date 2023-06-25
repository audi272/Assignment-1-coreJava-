package com.encora.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_10 {
	public static void main(String[] args) {
		// Question 10 : Reverse order of all elements of Java Array List
		List<Integer> l1 = new ArrayList<>();
		l1.add(11);
		l1.add(33);
		l1.add(55);
		l1.add(66);
		System.out.println("Before reversing the list :"+l1);
		Collections.reverse(l1);
		System.out.println("After reversing the list :"+l1);

	}

}
