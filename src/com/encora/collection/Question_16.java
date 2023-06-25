package com.encora.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question_16 {
	public static void main(String[] args) {
		// Question 16 : Add or insert an element to Array List using Java List Iterator
		List<Integer> l1 = new ArrayList<>();
		l1.add(11);
		l1.add(33);
		l1.add(55);
		l1.add(66);
		System.out.println("Before adding element : " + l1);
		ListIterator<Integer> listIterator = l1.listIterator();

		while (listIterator.hasNext()) {
			Integer val = listIterator.next();
			if (val == 33) {
				listIterator.add(44);
			}
		}
		System.out.println("After adding element : " + l1);
	}

}
