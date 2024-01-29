package com.onesofts.functionCall;

public class UsePencil {
	public static void main(String[] args) {
		Pencil pen1=new Pencil();
		pen1.brand="Doms";
		pen1.price=30;
		pen1.color="Black";
		
		Pencil pen2=new Pencil();
		pen2.brand="Natraj";
		pen2.price=15;
		pen2.color="red";
		
		Pencil[] pencils= {pen1,pen2};
		
			pen1.findHighCost(pencils);
		
		
	
		
	}

}
