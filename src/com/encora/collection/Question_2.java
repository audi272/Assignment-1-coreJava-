package com.encora.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_2 {
	public static void main(String[] args) {
		// Question 2 : Copy all elements of Java Array List to an Object Array
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));

	}

}
