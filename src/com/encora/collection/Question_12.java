package com.encora.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_12 {
	public static void main(String[] args) {
		// Question 12 -Sort Java Array List in descending order using comparator
		List<Integer> l1 = new ArrayList<>();
		l1.add(11);
		l1.add(33);
		l1.add(55);
		l1.add(66);
		System.out.println("Before reversing :"+l1);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("After reversing :"+l1);
		//by using lambda function 
		l1.stream().sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::println);

	}

}
