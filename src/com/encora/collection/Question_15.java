package com.encora.collection;

import java.util.LinkedList;

public class Question_15 {
	public static void main(String[] args) {
		//Question 15: Add elements at beginning and end of LinkedList
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(11);
		l1.add(33);
		l1.add(55);
		l1.add(66);
		
		//adding element at beginning of arraylist
		l1.addFirst(88);
		System.out.println(l1);
		//adding element at end of arraylist
		l1.addLast(99);
		System.out.println(l1);

	}

}
