package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// * Java Task1 +, -, *, /

		double a = 2.5d;
		double b = 5.2d;

		double sum, sub, mul, div;

		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;

		System.out.println("The addition of 2 numbers: " + a + " and " + b + "is equal to " + sum);
		System.out.println("The subdivision of 2 numbers:" + a + "and" + b + "is equal to" + sub);

		System.out.println("The subdivision of 2 numbers:" + a + "and" + b + "is equal to" + mul);

		System.out.println("The subdivision of 2 numbers:" + a + "and" + b + "is equal to" + div);

		// *2

		float num = 3.9f;

		float square = num * num;

		System.out.println("The square of the number" + num + " is" + square);

		System.out.println("=================Task02==========================");

		/*
		 * Task2 Write a program to print the area and perimeter of a rectangle with
		 * width = 5 and height = 8. Your program should say. “The perimeter of a
		 * rectangle with width ___ and height ____ is equal to _____ and the area is
		 * __”
		 */
		int height = 8;
		int width = 5;

		int area = height * width;
		int per = (width + height) * 2;

		System.out.println("The perimeter of  rectangle with width " + width + " and height " + height + " is equal to " + per
				+ " and the area is " + area + ".");

		double n1 = 200;
		double n2 = 100;
		sum = n1 + n2;
		sub = n1 - n2;
		mul = n1 * n2;
		div = n1 / n2;
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);

		int num1 = 3;
		int num2 = 7;
		int num3 = 5;
		int num4 = 1;

		// start coding here

		sum = num1 + num2;
		div = sum / num3;
		sub = div - num4;
		System.out.println(sum + div + sub);

	}

}
