package com.onesofts.functionCall;

public class Maximum {
	public String findMax(int age1,int age2,int age3) {
		if(age1>age2&&age1>age3) {
			//System.out.println(age1+" is max");
			return age1+" is elder";
		}
		else if(age2>age1&&age2>age3) {
			//System.out.println(age2+" is max");
			return age2+" is elder";
		}
		else {
			//System.out.println(age3+" is max");
			return age3+" is elder";
		}
	}
	
	public static void main(String[] args) {
		Maximum max=new Maximum();
		System.out.println(max.findMax(22, 57, 18));
	}

}
