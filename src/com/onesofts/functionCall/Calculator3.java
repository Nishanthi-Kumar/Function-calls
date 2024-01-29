package com.onesofts.functionCall;

public class Calculator3 {
	public int multiply(int num1,int num2) {
		return num1*num2;
	}
	public boolean lessthan(int num1,int num2) {
		return num1<num2;
	}
	public static void main(String[] args) {
		Calculator3 cal=new Calculator3();
		System.out.println(cal.multiply(10,20));
		System.out.println(cal.lessthan(12, 20));
	}

}
