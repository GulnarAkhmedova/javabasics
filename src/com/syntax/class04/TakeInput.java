package com.syntax.class04;

import java.util.Scanner;

/*
 * ctrl +shift+o how to import
 * 
 */
public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		//2. specify instructions
	System.out.println("Please enter country where you are from");
		//3 we need to capture String value --> use next ();
	
	String country=scan.next();
	System.out.println("you are form "+country);
	
	if(country.equalsIgnoreCase("usa")) {
		System.out.println("you speak english");
	} else if (country.equalsIgnoreCase("france")) {
		System.out.println("you speak french");
	}else if (country.equalsIgnoreCase("turkey")) {
		System.out.println("you are speak turkish");
	}else {
		System.out.println("i dont know which language you speak ");
	}
	
		
	}

}
