package com.syntax.class07HW;

import java.util.Scanner;

public class Task02HW {

	public static void main(String[] args) {
		
		
		/*Task 2. Ask a user to enter name, last name and age 5 times.
		 *  Every time your program should print those values in a format “You name is _ _ and you are _ years old’
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=scan.next();
		System.out.println("Please enter your last name");
		
		String serName=scan.next();
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		for(int i=0; i<5; i++ ) {
			
			System.out.println("YOur name is "+name+" "+serName+" and you are "+age+" years old" );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
