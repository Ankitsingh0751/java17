package com.lti.basics1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Varex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java 5
		List<String> list=Collections.<String>emptyList();
		
		//java 7
		List<String> list2=new ArrayList<String>();
		
		//java 8
		
		List<String> list3=new ArrayList<>();
		
		//Java 10
		
		Map<Integer,String> myMap=new HashMap<Integer,String>();
		
		var myMap2=new HashMap<Integer,String>();
		var myList=new ArrayList<String>();
		
		var message="Hello Scholars!!!";
		System.out.println(message);
		
		
		

	}

}
