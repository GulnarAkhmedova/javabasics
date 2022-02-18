package com.syntax.class07HW;

import java.util.Scanner;

public class Task01HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Task1.	Declare a variable to store a price for a coffee. 
	 * Ask user to pay for a coffee. Keep asking to pay for coffee until user enters exact amount . 
	 * If user give more than $3 --> ask them to give less,
	 *  if user gives less money then ask to give more.
	 *  Once user got a write amount print “Please enjoy your candy”
	 */
		
		
		int price=3;
		Scanner scan=new Scanner(System.in);
		int priceNumber;
		
		do {
		System.out.println("Please pay for a coffee");
		priceNumber=scan.nextInt();
		
		}while (priceNumber!=price);
		System.out.println("Please enjoy your coffee");
		
		System.out.println("---------------better example---------------------------");
		
		
		double price1 = 2.99;
		System.out.println("Please pay for your coffee");

		Scanner in = new Scanner(System.in);
		double pay;

		do {
		pay = in.nextDouble();
		if (pay > price1) {
		System.out.println("Please give less");

		} else if (pay < price1) {
		System.out.println("Please give more mone");
		}

		} while (pay != price1);

		System.out.println("Please enjoy your coffee");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
