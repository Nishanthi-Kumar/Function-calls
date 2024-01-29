

package com.onesofts.functionCall;

public class Bike {
	String brand;
	int speed;
	int price;
	int tax;
	public void findNetprice(int price,int tax) {
		System.out.println(price+(price*tax/100));
	}

}
