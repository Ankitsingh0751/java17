package com.lti.stringex;

import java.util.List;
import java.util.stream.Collectors;

public class StringBuilder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if(!java11Str5.equals("") || java11Str5.trim().length() != 0)  not required now 
		System.out.println("-----------isBlank()----------------");
		String s = "abc";
		System.out.println(s.isBlank());
		s = "";
		System.out.println(s.isBlank());
		s = "\t \t";
		System.out.println(s.isBlank());
		
		
		System.out.println("----------strip()----------");
		//Strip method does removes the white space with all leading and trailing space.
	    
		//it does not removes the white space in between the strings?
		
		String s2 = "  Hello,  \tWorld\t ";
		System.out.println("#" + s2 + "#");
		System.out.println("#" + s2.strip() + "#");
		System.out.println("#" + s2.stripLeading() + "#");
		System.out.println("#" + s2.stripTrailing() + "#");
		
		System.out.println("--------------repeat()--------------------");
		String s3 = "Hello\n";
		System.out.println(s3.repeat(3));
		s3 = "Do";
		System.out.println(s3.repeat(2));
		
		
		String output = "Hola " + "la ".repeat(4);
		System.out.println(output);
		

		//lines() method returns Stream of String objects. 	
		
		
		System.out.println("----------lines()------------");
		String s1 = "Hi\nHello\rWassup";  // This is \n an article on \n Java 11
		System.out.println(s1);
		List<String> lines = s1.lines().collect(Collectors.toList());
		System.out.println(lines); 
		
		System.out.println("Returned  size: " + lines.toArray().length);
		
		
	    String s11 = "I eat every fruit.\rFruit is good for health.\r\nBut "
	            + "I like Mango most.\nMango is "
	            + "the king of fruits";
	    s11.lines().forEach(System.out::println);
		

	}

}
