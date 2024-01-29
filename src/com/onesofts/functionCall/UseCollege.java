
package com.onesofts.functionCall;

public class UseCollege {
	public static void main(String[] args) {
		College col=new College();
		col.name="Hindustan";
		col.fees=100000;
		col.grade='c';
		
		College col1=new College();
		col1.name="Jain";
		col1.fees=60000;
		col1.grade='D';
		
		College col2=new College();
		col2.name="Sadhak";
		col2.fees=70000;
		col2.grade='B';
		
		College[] colgs= {col,col1,col2};
		//col.findMaxFees(colgs);
		System.out.println(col.findMinifees(colgs));
	
	
	}

}
