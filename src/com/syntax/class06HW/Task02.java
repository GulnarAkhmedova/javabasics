package com.syntax.class06HW;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 /*
		 * HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
          */

		  Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("Please use one of the operator: +,-,*,/");
		String operator=input.next();
		int result=2;
		if (operator.equals("+")) {
			result=num1+num2;
		}else if (operator.equals("-")) {
			result=num1-num2;
		}else if (operator.equals("*")) {
		result=num1*num2;
	}else if (operator.equals("/")) {
		
	}else {
		System.out.println("Invalid entry");
	}
		System.out.println("The result is "+result);
		
		
	}
}
