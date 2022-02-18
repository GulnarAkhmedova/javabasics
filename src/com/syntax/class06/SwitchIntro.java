package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day=5;
		
		String dayName;
		if (day==1) {
			dayName="Monday";
		}else if (day==2) {
			dayName="tuesday";
		}else if (day==3) {
			
		dayName="wednesday";
		}else if (day==4) {
			dayName="thurday";
		}else if (day==5) {
			dayName="friday";
		}else if (day==6) {
			dayName="saturday";
		}else if (day==7) {
			dayName="sunday";
		}else {
			dayName="invalid";
		}
		
		System.out.println(dayName);
		
		switch (day) {
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="tuesday";
			break;
		case 3:
			dayName="wednesday";
			break;
		case 4:
			dayName="thurday";
			break;
		case 5:
			dayName="friday";
			break;
		case 6:
			dayName="sutarday";
			break;
		case 7:
			dayName="sunday";
			break;
			default:
				dayName="invalid";
				break;
				
		}
		
		System.out.println(dayName);
		
	}

}
