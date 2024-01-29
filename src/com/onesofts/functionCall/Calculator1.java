package com.onesofts.functionCall;

public class Calculator1 {
	public int add() {
		int num1=20;
		int num2=18;
		return num1+num2;
	}
	public int sub() {
		int num1=90;  
		int num2=10;
		return num1-num2;         
	}
	
	public static void main(String[] args) {
		Calculator1 calc=new Calculator1();
		System.out.println(calc.add());
		System.out.println(calc.sub());
	}

}
