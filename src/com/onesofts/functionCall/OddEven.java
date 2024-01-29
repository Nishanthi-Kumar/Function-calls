package com.onesofts.functionCall;

public class OddEven {
	public String findOddEven() {
		int num=7;
		if(num%2==0) {
			return num+" Even";
		}else {
			return num+" Odd";
		}
	}
	
	public static void main(String[] args) {
		OddEven oddeven=new OddEven();
		System.out.println(oddeven.findOddEven());
	}

}
