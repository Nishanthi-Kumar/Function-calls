package com.onesofts.functionCall;

public class SquareCube {
	public int square(int num) {
		return num*num;
	}
	public int cube(int num) {
		return num*num*num;
		
	}
	public static void main(String[] args) {
		SquareCube sqcu=new SquareCube();
		System.out.println(sqcu.square(6));
		System.out.println(sqcu.cube(4));
		
	}


}
