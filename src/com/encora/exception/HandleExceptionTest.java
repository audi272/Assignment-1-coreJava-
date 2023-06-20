package com.encora.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandleExceptionTest {
	public static void divide(int a, int b) {
		try {
			@SuppressWarnings("unused")
			int result = a / b;
		} catch (Exception e) {
			throw new ArithmaticException("Arithamatic Exception occured...");
		}
	}
	public static void file(String filename) throws IOException {
		try {
			FileReader reader = new FileReader(filename);
			reader.close();
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("File Not Found : " +filename);
		}
	}
	public static void main(String[] args) throws IOException {
		try {
			file("abc.txt");
			divide(14, 0);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ArithmaticException e) {
			System.out.println(e.getMessage());
		}
	}
}
