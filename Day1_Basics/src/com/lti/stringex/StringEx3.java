package com.lti.stringex;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String string="animals";
			System.out.println("length is " + string.length());
			System.out.println("\nIndexOf");
			
			System.out.println(string.indexOf('a'));			
			System.out.println(string.indexOf("as"));
			System.out.println(string.indexOf('a',4));
			System.out.println(string.indexOf("al",5));
			
			
			System.out.println("\nSubstring");
			System.out.println("1 "+string.substring(3));
			System.out.println(("2 "+string.substring(string.indexOf('m'))));
			System.out.println("3 "+string.substring(3,4));	
			System.out.println("4 "+string.substring(3,3));
			System.out.println("5 "+string.substring(3,7));
			
			
			System.out.println("abc".contentEquals("ABC"));
			
			
			System.out.println("Replace()- replaces each occurance");
			System.out.println("abcab".replace('a','A'));
			
			System.out.println("    abc                 ".trim()+"see");
			
	}

}
