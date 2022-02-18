package com.syntax.class04.HW;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("how old are you?");
		int input=scan.nextInt();
		if(input>=18) {
			System.out.println("you are eligible for a driver lisence");
		}else {
			System.out.println("you are under age, get lerners permit");
		}
		
	}

}
