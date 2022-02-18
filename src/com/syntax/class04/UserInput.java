package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("please enter your name");
		//if you want to capture single String _>use next();
		String name=input.next();
		System.out.println("your name is "+  name);
	
		//if you want to capture int--> use nextInt();
		
		System.out.println(name+" please inter your age");
		int age=input.nextInt();
		System.out.println("your name is "+name+" and your age is "+age);
		
		
	}

}
