package com.encora.CoreJavaAssignments;
//Assignment- 1
// Q-2

import java.util.Scanner;

public class ATMTransaction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pooja's withdraw Amount : ");
		int withdramAmount = sc.nextInt();
		System.out.println("Enter Pooja's account balance : ");
		double accBalance = sc.nextDouble();
		//check if withdraw amount is multiple of 5 and there is enough balance
		if(withdramAmount%5==0 && withdramAmount +0.5<=accBalance) {
			//deduct the withdraw amount and bank charges from the acc balance
			accBalance -=(withdramAmount+0.5);
		}
		System.out.printf("%.2f",accBalance);
	}
}
