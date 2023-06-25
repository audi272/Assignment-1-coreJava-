package com.encora.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Question_17 {
	public static void main(String[] args) {
		// Question 17 : Traverse through Array List in reverse direction using Java List Iterator
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);

		ListIterator<Integer> List_Iterator = list.listIterator(list.size());
		while (List_Iterator.hasPrevious()) {
			System.out.println(List_Iterator.previous());
		}
	}
}
