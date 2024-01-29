package com.onesofts.functionCall;

public class Sample {
	public int sample() {
		int count=0;
		int a = 0;
		for(int i=1;i<=10;i++) {
			count=count+1;
			if(count==i) {
				a = a+1;
			}
		}
		return a;
		
	}
	
	public static void main(String[] args) {
		Sample s = new Sample();
		
		System.out.println(s.sample());
		
	}

}
