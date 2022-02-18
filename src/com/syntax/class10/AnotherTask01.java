package com.syntax.class10;

public class AnotherTask01 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
          *After storing values print following String:
          *Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
String[][]names=new String[2][4];
		//1 row or 1array
		
		names[0][0]="mr";
		names[0][1]="mrs";
		names[0][2]="ms";
		names[0][3]="miss";
		
		
		//2 row 
		
		names[1][0]="smith";
		names[1][1]="jordan";
		names[1][2]="jackson";
		names[1][3]="obama";
		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][0]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		
		
		
		
		
		
		
	}

}
