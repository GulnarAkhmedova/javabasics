package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		// creating an array that holds 4 elements 
		int[]numbers=new int[4];
		//storing value/element inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		// print 99
		System.out.println(numbers[3]);
		
		System.out.println(numbers[3]+numbers[0]);//total 189
	
		
		// i want to create an array of countries
		
		String[]countries=new String[5];
		countries[0]="usa";
		countries[1]="canada";
		countries[2]="afghanistan";
		countries[3]="moldova";
		countries[4]="morocco";
		
		countries[5]="turkey";
		
		System.out.println(countries[3]+countries[4]);
	}

}
