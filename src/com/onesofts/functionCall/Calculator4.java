package com.onesofts.functionCall;

public class Calculator4 {
	public void div(int num1,int num2) {
		System.out.println(num1/num2);
	}
	public void modulus(int num1,int num2) {
		System.out.println(num1%num2);
	}
	public static void main(String[] args) {
		Calculator4 cal=new Calculator4();
		cal.div(21, 3);
		cal.modulus(5, 3);
	}

}
