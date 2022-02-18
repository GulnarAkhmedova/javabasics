package com.syntax.class04.HW;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("What is your City?");
	String city=scan.next();
	System.out.println("What is the temperature in "+city);
	float fahr=scan.nextFloat();
	float cels=((fahr-32)*5)/9;
	System.out.println("The temperature in "+city+" is "+cels+" degrees");
		
		
	}

}
