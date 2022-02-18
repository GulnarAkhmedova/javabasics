package com.syntax.class05HW;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner height =new Scanner(System.in);
	System.out.println("Enter person height (in inches)");
	
	int heightInc=height.nextInt();
	if(heightInc<60) {
		System.out.println(" you are short!");
	} else if (heightInc>=60 && heightInc<=72) {
		System.out.println(" you are medium height!");
	} else if (heightInc>72) {
		System.out.println("you are very tall ");
	}




	}

}
