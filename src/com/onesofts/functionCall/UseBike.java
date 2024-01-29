package com.onesofts.functionCall;

public class UseBike {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.brand="Yamaha";
		bike.speed=160;
		bike.price=175000;
		bike.tax=5;
		bike.findNetprice(bike.price, bike.tax);
		
	}

}
