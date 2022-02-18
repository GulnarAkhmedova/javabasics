package com.syntax.class06HW;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Allow user to enter grade (A, B, or C etc...) and then provide 
		 * explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *  At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Please enter your grade");
		
		
		String grade= scan.nextLine();
		 switch (grade.toUpperCase() ){
		case "A":
			grade="Excellent";
			break;
		case "B":
			grade="Good";
			break;
		case"C":
			grade="Average";
			break;
		case "D":
			grade="Bad";
			break;
	default:
		grade="Not Acceptable";
	
	
		}
		 System.out.println("Your grade is "+grade);
	}	
		
		
	}


