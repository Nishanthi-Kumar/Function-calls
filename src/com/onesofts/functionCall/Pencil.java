package com.onesofts.functionCall;

public class Pencil {
	String brand;
	int price;
	String color;
	public void findHighCost(Pencil[]a) {
		for(int i=0;i<a.length;i++) {
		if(a[i].price>=20) {
			System.out.println(a[i].price+" is high cost");
		}else {
			System.out.println(a[i].price+" is low cost");
		}
	}
	

	}
}
