package com.encora.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_11 {
	public static void main(String[] args) {
		// Question 11 : Shuffle elements of Java Array List
		List<Integer> l1 = new ArrayList<>();
		l1.add(11);
		l1.add(33);
		l1.add(55);
		l1.add(66);
		System.out.println("Before suffle : "+l1);
		Set<Integer> set=new HashSet<>(l1);
		System.out.println("After suffle :" +set);

	}

}
