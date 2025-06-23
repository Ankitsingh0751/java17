package com.lti.stringex;

public class StringEx {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		
		System.out.println(str1==str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3=new String("Hello");
		System.out.println(str3.hashCode());
		
		if(str1==str3)
		{
			System.out.println("Login");
		}
		else {
			System.out.println("Failed");
		}
	}
}
