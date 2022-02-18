package com.syntax.class03;

public class PrimativeCasting {

	// main+crtl+space
	public static void main(String[] args) {
		System.out.println("Widening");
		int  i=100;
		System.out.println(i);
		
		//widening or implicit
		//we store int value 10 inside double variable
		double d=10;
		System.out.println(i);//10
		System.out.println(d);//10.0
		
		
		
		System.out.println("Narrowing");
		//narrowing or explicit casting
		// we store double value 10.99 into int variable 
		int num=(int)10.99;
		System.out.println(num);
		
		float f=10.99f;  //type mismatch: cannot convert from double to float
		System.out.println(f);
		
		System.out.println("======");
		byte b=(byte)128;
		System.out.println(b);
		
		int number=(int)12546879954l;
		System.out.println(number);
		
	   
	}

}
