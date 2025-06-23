package com.lti.basics1;

import java.util.Date;
//import java.sql.Date;

public class Demo3Imports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		
		java.util.Random r=new java.util.Random();
		System.out.println(r);
		
		Date d=new Date();
		System.out.println(d);
		
		Date d1=new Date(10/5/22); 
		System.out.println(d1);
		
		java.sql.Date d2=new java.sql.Date(10/5/2022);
		System.out.println(d2);
		
		System.out.println('a'+'b');
		System.out.println(5+7+"11"+5+6);
		
		int m=1;
		m+=++m + m++ + ++m +m++;
		System.out.println(m);
		
		int s=6;
		long t=3;
		if(s%3>=1) {
			t++;
//			t--;
			
		}
		t--;
		System.out.println(t);
		
			

	}

}
