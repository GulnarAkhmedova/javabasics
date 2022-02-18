package com.suntax.reviewclass3;

public class IfElseDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Sunday";
		if(day.equals("Sunday")) {
			System.out.println(" its weekend");
		}else {
			System.out.println(" its weekday ");
		}
	
		if(day.equals("Saturday")) {
			System.out.println("its weekend");
		}else if (day.equals("Saturday")){
			
		}else {
			System.out.println("its weedkay");
			
		}
		if(day.equals("snday")|| day.equals("saturday")) {
			System.out.println("its weekedn");
		}else {
			System.out.println("its weekday");
		}
		
	}

}
