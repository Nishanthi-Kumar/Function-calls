package com.onesofts.functionCall;

public class Calculator2 {
	public void add() {
		int num1=20;
		int num2=40;
		System.out.println(num1+num2);
		
	}
	public void sub(int num1,int num2) {
		//int num1=30;
		//int num2=40;
		System.out.println(num1-num2);
	}
	public int mul() {
		int num1=20;
		int num2=10;
		return num1*num2;
	}
	public boolean greaterthan(int num1,int num2) {
		return num1>num2;
	}
	public static void main(String[] args) {
		Calculator2 cal=new Calculator2();
		cal.add();
		cal.sub(80,30);
		System.out.println(cal.mul());
		System.out.println(cal.greaterthan(27, 78));
	}

}
