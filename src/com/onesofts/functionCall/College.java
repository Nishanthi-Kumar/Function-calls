package com.onesofts.functionCall;

public class College {
	String name;
	int fees;
	char grade;
	
	public void findMaxFees(College[] clgs) {
		int max=0;String temp="";
		for(int i=0;i<clgs.length;i++) {
			if(clgs[i].fees>max) {
				max=clgs[i].fees;
				temp=clgs[i].name;
				
			}
		}
	
		System.out.println(max+" "+temp);
		//System.out.println(temp);
	}	
	
	public College findMinifees(College[] clgs) {
		College mini=clgs[0];
		for(int i=0;i<clgs.length;i++) {
			if(clgs[i].fees<mini.fees) {
				mini=clgs[i];
				
			}
		}
		return mini;
	}
	

}
