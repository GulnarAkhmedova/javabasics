package com.syntax.class08;

public class ForLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
		}
		
		System.out.println("   MULTIPLICATION TABLE   ");
		/* 3X1=3
		 * 3X2=6
		 * 3X3=9
		 * 
		 */
		int num=3;
		int result;
		for(int i=1; i<=10; i++) {
			result=num*1;
			System.out.println(num+" X "+i+" = "+result);
		}
		
		System.out.println(" -WHAT IS THE OUTPUT-");
		
	
		int sum=0;
		for(int i=1; i<=5; i++) {
		
		sum+=i;
		System.out.println(sum);
		
		}
		
		System.out.println(" -WHAT IS THE OUTPUT-");
		int value=1;
		for(int i=1; i<4; i++) {
			value*=i;
		}
		
		System.out.println(value);
		
		/*
		 * 
		 */
		
		int value1=0;
		for(int i=2; i<50; i+=2) {
			value1+=i;
		}
		System.out.println(value1);
		
		
		
		
	}

}
