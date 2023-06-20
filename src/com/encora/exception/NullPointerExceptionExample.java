package com.encora.exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
