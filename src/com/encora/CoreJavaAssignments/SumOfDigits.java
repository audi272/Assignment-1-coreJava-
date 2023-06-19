package com.encora.CoreJavaAssignments;

//Assignment- 1
// Q-1
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of test cases: ");
		int t = scanner.nextInt();
		// iterate over no of test cases..
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int digitSum = 0;
			while (n > 0) {
				digitSum += n % 10;// Add the last digit to the sum
				n /= 10; // Remove the last digit from the number
			}
			System.out.println("Sum of digits: " + digitSum);
		}
	}
}
