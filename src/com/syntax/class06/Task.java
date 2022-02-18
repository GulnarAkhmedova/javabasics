package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		    Scanner input= new Scanner(System.in);
		   
		    System.out.println("Enter your country ");
		    String country = input.nextLine();
		    
		    String language = null;
		    switch(country.toLowerCase()){
		        case "usa":
		            language="english";
		            break;
		        case "russia":
		            language="russian";
		            break;
		        case "germany":
		            language="deutsch";
		            break;
		       
		        default:
		            language="uknown";
		    }
		    System.out.println("In "+country+" people speak "+language);
		}
		
		
		
		
	}


