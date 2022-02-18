package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine=true;
		int dose=2;
		
		if(vaccine) {
			System.out.println("how many doses you have?");
	
		if(dose==1){
			System.out.println("you need aothe shot");
		}else 
		System.out.println("you are fully baccinated ");
		}
	System.out.println("----------------------------------------------");	
	
	/* declare a variable for allergy
	 * 
	 * if you have an allergy -->
	 *                      if you have poller
	 *                      if you have peanut
	 *                      if you have wheat 
	 * if no allergy -->you are lucky!                     
	 */
	boolean allergy=true;
	if (allergy) {
		System.out.println("les's check what allergies you have");
		
		String allergyType="pollen";
		
		// nested if _> always has a depenvency on outler if.
		//outer if must be true in order for nested if to be checked 
		
		if (allergyType.equals("pollen")) {
			System.out.println("please stay at home when trees are blooming. Take medicin");
		}else if (allergyType.equals("peanut")) {
			System.out.println("please do not eat food that contains nuts. take med B");
		}
		else if (allergyType.equals("gluten")) {
			System.out.println("please follow gluten free diet. take mec C");
		}
		else {
			System.out.println("i dont which suggestion to give you");
		}
		
	}else {
		System.out.println("you are lucky");
	}
	System.out.println("-----------------------------------------");
	
	//Task 1
	
	boolean diploma=true;
	if (diploma) {
		System.out.println("congratulations");
		
		double gpa=3.5;
		if (gpa>3.5) {
			System.out.println("you are eligible for scholarship");
		}else {
			System.out.println("you should have studied harger");
		}
	
	}else {
		System.out.println("please get a degree");
	}
	
System.out.println("------------------------------------------");

//Task 2
  //

double mortgageRate = 3.5;

int mortgagePrice = 45000;

if (mortgageRate > 4.5) {
	System.out.println("You can not buy a house");
} else {
	System.out.println("You can buy a house");
	if (mortgagePrice > 50000) {
		System.out.println("You should take a loan");
	} else {
		System.out.println("You can pay cash");
	}
}

	}	
	
	
}

