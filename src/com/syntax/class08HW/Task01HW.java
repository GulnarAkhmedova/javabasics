package com.syntax.class08HW;

public class Task01HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a = 0; a <= 12; a++) {
			for (int b = 0; b <= 59; b++) {
				for (int c = 0; c <= 59; c++) {
					System.out.println(a + " : " + b + " : " + c);

				}
			}
		}

		System.out.println("-------------------clock example------------------");

		String time;
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m <= 59; m++) {
				if (h < 10 && m < 10) {
					time = "0" + h + ":" + "0" + m;

				} else if (h < 10 && m >= 10) {
					time = "0" + h + ":" + m;

				} else if (h >= 10 && m < 10) {
					time = h + ":" + "0" + m;

				} else {
					time = h + ":" + m;

				}
				System.out.println(time);
			}
		}
System.out.println("___________________another clock example________________________");

for (int a = 0; a <= 2; a++) {
	for (int b = 0; b <= 9; b++) {
		if (a == 2 && b == 4) {
			break;
		}
		for (int c = 0; c <= 5; c++) {
			for (int d = 0; d <= 9; d++) {
				System.out.println(" " + a + b + ":" + c + d);
		
				
				
			}
			}
	}
		}
	}
}