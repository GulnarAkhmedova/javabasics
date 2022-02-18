package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=3; i++) {
			System.out.println("I am i loop"+i);
			
		for (int j=1; j<=2; j++) {
			System.out.println(" i am nested j loop"+j);
		}
			
		}
		System.out.println("------------------task----------------------");
		
		for (int a=1; a<=9; a++) {
			for(int b=0; b<=9; b++) {
				for(int c=0; c<=9; c++) {
	
					System.out.println(a+" "+b+" " +c);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
