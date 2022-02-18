package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("the value if i outside of whiel loop="+i);
		
		//i need to print values form 2 to 20
		int a=2;
		while(a<=20) {
			System.out.println(a);
			a++;
			
			
		}
		 int b=1;
		 while(b<=50) {
			 System.out.print(b+" ");
			 b++;
			 
		 }
		 System.out.println("-- I NEED NUM FROM 20 TO 1--");
		 int c=20;
		 while(c<=1) {
			 System.out.print(c+" ");
			 c--;
		 }
		
		System.out.println("the end");
		
		//TASK
		
		int h=30;
		while (h<=20) {
			if(h%2==0) {
				System.out.println(h+" ");
				h++;
			}
			
		}
		
		int i1=15;
		while(i1<=0){
		  System.out.println(i);
		  i1--;
		}
		
	}

}
