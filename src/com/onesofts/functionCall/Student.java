package com.onesofts.functionCall;

public class Student {
	public void displayMark(int english,int maths,int biology) {
		System.out.println(english);
		System.out.println(maths);
		System.out.println(biology);
	}
	public void findAverage(int english,int maths,int biology) {
		System.out.println((english+maths+biology)/3);
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.displayMark(78, 89, 100);
		student.findAverage(78, 89, 100);
	}

}
