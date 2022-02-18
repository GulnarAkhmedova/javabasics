package com.syntax.class04.HW;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("how much loan do you need?");
		int input=scan.nextInt();
		if(input<=200000) {
			System.out.println("you are eligible for the loan.");
		}else {
			System.out.println("can not give you loan it is above are limit");
		}
		
		
	}

}
