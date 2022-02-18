package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {
		
		
		int[]numbers=new int[4];
		numbers[3]=1;
		numbers[2]=2;
		numbers[1]=3;
		numbers[0]=4;
		System.out.println(numbers[3]);
		
		System.out.println("====================================");
		
		// create an array and retrieve all elements in reverse order
		System.out.println("Printing array numbers (0-9) in reverse:");
		int[] numbers1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i=numbers1.length-1; i>=0; i--){
		    System.out.print(numbers1[i]+" ");
		}
		System.out.println("==============another way===================");
		
		int[] arrs= {45,23,15,10,45,68,2,3,4};
		for(int i=0; i<arrs.length; i++ ) {
			System.out.println(arrs[arrs.length-i-1]);
		
		
	}
	}
}
