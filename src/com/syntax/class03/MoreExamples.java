package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
/*
 * we need to declare a boolean variable hungry yes or no
 * 
 * if we are hungry--> i am going to eat
 * otherwise --> I am going to drink a tea
 *
 * 
 * */
	
	boolean hungry=true;
	
	if(hungry){
		System.out.println("I am going to eat");
	}else {
		System.out.println("I am gong to drink a tea");
	}
	System.out.println("===========================================");
	
	boolean traffic=true;
	if(traffic) {
		System.out.println("i am coming home late");
	}
	
	/* define a variable to store a browser
	 * if brower is chrome --> we are executing rests on chrome
	 * otherwise --> i am not executing any test cases
	 *
	 */
	
	
	System.out.println("===============================");
	
	String browser="chrome";
	
	if (browser.equals("chrome")) {
		System.out.println("we are executing tests on chrome");

	}else {
		System.out.println("we are not executing any test cases");
		
			
	}
	
	/*
	 * define a variable to stoe a vulue of day 
	 * 
	 * if day is saturday--> I am having java class today 
	 * otherwise --> i dont know witch class I have
	 *
	 */
	System.out.println("=========================================");
	
	String day="Saturday";
	
	if (day.equals("Saturday")) {
			System.out.println("i am having java class today");
			System.out.println("i am very excited");
			System.out.println("i am going to have fun with my classmates");
		}else {
			
		System.out.println("i dont know");	
		
		
	}
	}	
}
