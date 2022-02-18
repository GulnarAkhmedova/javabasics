package com.syntax.class05HW;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("please enter todays day");
		int day=input.nextInt();
		if (day==1 || day==2 ||day==3 ||day==4 ||day==5 ) {
			System.out.println("it is a weekday");
		}else if (day==6|| day==7) {
			System.out.println("it is a weekend");
		}else {
			System.out.println("invalid day");
		}
		
		
		
	}

}
