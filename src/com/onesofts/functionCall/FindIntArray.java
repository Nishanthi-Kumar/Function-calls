package com.onesofts.functionCall;

public class FindIntArray {
	public void findMax(int[]a) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		FindIntArray array=new FindIntArray();
		int[] ages= {10,20,30,40,50};
		array.findMax(ages);
	}

}
