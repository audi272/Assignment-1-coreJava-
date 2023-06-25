package com.encora.collection;

import java.util.ArrayList;

public class Question_1 {
	public static void main(String[] args) {
		// Question 1 : Remove an element from specified index of Java Array List
		ArrayList<Integer> list = new ArrayList<>();
		int index = 2;
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.remove(index);
		System.out.println(list);

	}

}
