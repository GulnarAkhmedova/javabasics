package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	char choice='l';
	String answer;
	switch (choice) {
	
	case 'y':
		answer ="yes";
		break;
	case 'n':
		answer ="no";
		break;
	case 'm':
		answer ="maybe";
		break;
		default:
			answer="unknown";
	}
		System.out.println(answer);
		System.out.println("-------------------------------");
		/*
		 * declare a variable to store a car
		 * based on the value define the country of origin
		 */
		String car="LADA";
		String country;
		 switch(car.toLowerCase()) {
		 
		
		case "BMW":
			country="germany";
			break;
		case "ford":
	
			country= "USA";
			break;
		case "lada":
			
			country ="russia";
			break;
		case "toyota":
			country ="japan";
			break;
		default:
			country="unknown";
		
		}
		System.out.println(car+" is from "+country+" country" );	
	}
}

