package com.suntax.reviewclass3;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		if (num == 10) {
			System.out.println(" number is 10");
		}
		if (num == 15) {
			System.out.println(" number is 15");
		}

		if (num == 20) {
			System.out.println(" number is 20");

		}
        //best practice to write if conditions 
		if (num == 10) {
			System.out.println(" number is 10");
		} else if (num == 15) {
			System.out.println("number is 15");
		} else if (num == 20) {
			System.out.println(" number is 20");
		}

	}

}
