package com.lti.excel;

public class Excel {
	int x;
	

	public void add(int x,int y) {
		System.out.println("Add called");
		int result=x+y;
		System.out.println(result);
	}
	
	public void sub() {
		System.out.println("Sub called");
		int x=10;
		int y=20;
		int result=x-y;
		System.out.println(result);
	}
}
