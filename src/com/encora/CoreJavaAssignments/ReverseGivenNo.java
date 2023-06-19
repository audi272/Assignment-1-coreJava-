package com.encora.CoreJavaAssignments;
//Assignment- 1
//Q-4
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseGivenNo {
	public static void main(String[] args) {

		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		List<Integer> number = new ArrayList<Integer>();
		// Read the list of integers from the user
		System.out.println("Enter the length of integer list ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the number :");
			number.add(scanner.nextInt());
		}
		for (Integer num : number) {
			int reverse = 0;
			while (num != 0) {
				int rem = num % 10;
				reverse = reverse * 10 + rem;
				num = num / 10;
			}
			System.out.println("The reverse of the given number is: " + reverse);
		}
	}

}
