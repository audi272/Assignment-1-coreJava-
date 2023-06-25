package com.encora.collection;

import java.util.ArrayList;
import java.util.List;

public class Question_3 {
	public static void main(String[] args) {
		//Question 3 : Create List from Java Object Array
		int[] array= {12,14,45,47,89,85};
		List<Integer> list=new ArrayList<>();
		for (Integer integer : array) {
			list.add(integer);
		}
		System.out.println(list);
	}

}
