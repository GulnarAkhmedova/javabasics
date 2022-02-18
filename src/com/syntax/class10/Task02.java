package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {
		
		/*
		 * create an array of countries. while retrieving all value from an array print
		 * capital for each country.
		 */
		
		String[] countries = {"Poland", "Germany", "Ukraine", "Russia", "UK"};
		String capital=null;
		for (int i=0; i<countries.length; i++) {
		switch (countries[1]){
			case "poland":
				capital="warsaw";
				break;
			case "germany":
			capital="berlin";
			break;
			case "ukraine":
				capital="kiev";
				break;
			case "russia":
			capital ="moskov";
			break;
			case "uk":
				capital="london";
				break;
			
	}
		System.out.println("the capital of "+countries[i]+" is "+capital);
		}
		
		{
		System.out.println("======================another was===========================");
		
	for(String country:countries) {
		if (country.equals("poland")) {
			capital="warsaw";
			
		}else if (country.equals("gremany")) {
			capital="berlin";
		}else if (country.equals("ukraine")) {
			capital="kiev";
		}else if (country.equals("russia")) {
			capital="moskov";
		}else if (country.equals("uk")) {
			capital="london";
		}
		System.out.println("the capital of "+country+" is "+capital);
	}
		
}	
		
	}	
		
		
		
		
		
		
		
		
		
		

	}


