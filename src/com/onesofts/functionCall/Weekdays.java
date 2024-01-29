package com.onesofts.functionCall;

public class Weekdays {
	public void findDay(String day) {
		switch(day) {
		case "mon": System.out.println("1st day");break; 
		case "tue":System.out.println("2nd day");break;
		case "wed":System.out.println("3rd day");break;
		case "thurs":System.out.println("4th day");break;
		case "fri":System.out.println("5th day");break;
		case "sat":System.out.println("6th day");break;
		case "sun": System.out.println("7th day");break;
		default:System.out.println("Invalid data");
		}
		
	}
	
	public static void main(String[] args) {
		Weekdays week=new Weekdays();
		week.findDay("thurs");
		
	}

}
