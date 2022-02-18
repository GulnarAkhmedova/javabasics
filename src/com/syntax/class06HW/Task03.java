package com.syntax.class06HW;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		/*
		 * 3. Write a program to ask user to enter value for sale: yes or no + if there
		 * is no sale --> you are not going for shopping + if there is sale ask you user
		 * for the price of the item +
		 * Based on the price you have to calculate the price of the item after the
		 * discount
		 * if price is less than $20 --> apply 10% discount if price is between $20 &*
		 * $100 --> 20% discount if price between $100 & $500 --> 30% discount otherwise
		 * apply 50% discount
		 * Output of the program should be:
		 * After discount ___ the price of the item reduce from __ to ___
		 */
		// What value is assigned to discount ?

		double discount;
		double totalAmount;
		
		Scanner input = new Scanner(System.in);
		System.out.println("is there any sale ?  (YES or No) ");
		String answer = input.nextLine();
		
		

		if (answer.equalsIgnoreCase("yEs")) {
			System.out.println("we are going to shopping");

			System.out.println("How much is this item ? ");
			double price = input.nextDouble();

			if (price >0 && price <= 20) {
				discount = price * 0.10;
			} else if (price > 20 && price <= 100) {
				discount = price * 0.2;
			} else if (price > 100 && price <= 500) {
				discount = price * 0.3;
			} else {
				discount = price * 0.5;
			}
			totalAmount = price - discount;
			System.out.println("after  $ " + discount + " discount the price of the item is reduced from " + price
					+ " to " + totalAmount);
			
		} else {
			System.out.println("We are not going to shopping");
		}
		
	}
}
