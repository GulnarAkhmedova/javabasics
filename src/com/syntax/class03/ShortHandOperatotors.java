package com.syntax.class03;

public class ShortHandOperatotors {

	public static void main(String[] args) {

		// +,-,*,/,%

		int num = 100;
		num = num + 100;
		System.out.println(num);// 200

		num += 100;// this extra means -->this num=num+100
		System.out.println(num);// 300

		num -= 20;
		System.out.println(num);// 280
		num /= 10; // shorter way of num=num/10
		System.out.println(num);// 28
		num %= 2;
		System.out.println(num); // 1

		System.out.println("Task1          ");
		num += 500;
		num += 200;
		System.out.println(num);
		System.out.println(" Task2     ");
		num -= 60;
		System.out.println(num);

		System.out.println(" Task3           ");
		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);

		System.out.println("Task4             ");
		int cake = 25;
		cake %= 7;
		System.out.println(cake);

	}

}
