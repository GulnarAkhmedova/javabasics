package com.syntax.class04.HW;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		String input = scan.next();
		if (input.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance of your Credit card?");
			double balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Pay off immedately.");
			} else {
				System.out.println("You need to stent more");
			}

		} else {
			System.out.println("would you like to get a credit card?");
		}

	}

}
