package com.suntax.reviewclass3;

public class IfElseDemo5 {

	public static void main(String[] args) {
		
		
		int price=10;
		boolean sale=true;
		char gender='F';
		double discount=0.15;
		double finalPrice=0;
		
		if (sale) {
			if(gender=='F') {
				if(price>5) {
					finalPrice=price-price*discount;
				}
			}
		}else {
			finalPrice=price;
		}
		
		if(sale&&gender=='F'&&price>5) {
			//finalPrice=price-price*discount;
			System.out.println(" line1");
		}else {
			//fanalPrice=price;
			System.out.println("line 2");
		}
		
		
		
		
		
		
		
		
	}

}
