package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*create a secter numbr
 * 
 * we want user to guess our secret number
 * 
 * the moment user guessed my secret number-----> my program should stap
 * otherwise is should continue asking to guess my number 
 * 
 */
		
		int secretNumber=12;
		Scanner scan=new Scanner(System.in );
		int guessNumber;
		do {
			System.out.println("please enter a number to win");
			 guessNumber=scan.nextInt();
			
		}while (guessNumber!=secretNumber);
		
		System.out.println("congrats!");
	}

}
