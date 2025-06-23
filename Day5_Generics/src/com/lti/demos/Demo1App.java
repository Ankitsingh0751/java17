package com.lti.demos;

import java.util.ArrayList;
import java.util.List;

public class Demo1App {
	
	static void printNames(List<String> list) {
		
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
			
		}
		
		
	}

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add(new String("Jay"));
		//names.add(new StringBuilder("Vijay"));
		//If done this Class Cast Exception..at line 12 during runtime if generic not set up
		names.add("Vijay");
		printNames(names);
		
		
	}
}
