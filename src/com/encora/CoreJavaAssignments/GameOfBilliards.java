package com.encora.CoreJavaAssignments;
//Assignment- 1
//Q-3
import java.util.Scanner;

public class GameOfBilliards {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//enter the number of rounds in the game
		System.out.println("Enter the no of rounds : ");
		int rounds = sc.nextInt();
		
		// initialize all players score
		int player1score=0;
		int player2score=0;
		int winner=0;
		int maxlead=0;
		for (int i = 0; i < rounds; i++) {
			//score of player1
			int Si = sc.nextInt();
			//score of player2
			int Ti = sc.nextInt();
			player1score +=Si;
			player2score +=Ti;
			int lead = Math.abs(player1score-player2score);
			if(lead > maxlead) {
				maxlead=lead;
				winner=(player1score>player2score)?1:2;
			}
		}
		System.out.println(winner +" "+maxlead);
	}
}
