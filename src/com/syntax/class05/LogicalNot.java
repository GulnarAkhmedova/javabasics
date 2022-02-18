package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//logical not is used to revest to condition
		
		
		boolean value=!false;
		System.out.println(value);
		
		boolean traffic= false;
		if (!traffic) {
			
			System.out.println(" i will com on time to work");
		}
		
	String day ="Saturday";
	if (!day.equals("Saturday")) {
		System.out.println("today is not saturday");
	}
		boolean checkboxChecked=false;
		if(!checkboxChecked) {
			System.out.println(" i willclick on that checkbox ");
			String java="easy";
			
			if(!java.equals("hard")) {
				System.out.println("you are genius");
			}
			
		}
		
		
		
	System.out.println("----------------THE END-------------------");	
	}

}
