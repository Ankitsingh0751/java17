package com.lti.stringex;

public class StringEx2 {
	public static void main(String[] args) {
		
		String s1="hello";
		s1=s1.concat(" world");
		System.out.println(s1);
		
		
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("world");
		System.out.println(sb);
	}

}
