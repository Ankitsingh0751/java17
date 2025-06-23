package com.lti.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class demo1 {
	public static void main(String[] args) {
		
		List myList=new ArrayList();
		myList.add("abc");
		myList.add("xyz");
		
		Object s=myList.get(0);
		//String s=myList.get(0) //Error- as no type is set to List
		System.out.println(s);
		
		
		System.out.println("-------------");
		
		List<String> myList2=new ArrayList<>();
		myList2.add("abc");
		myList2.add("xyz");
		String s2=myList2.get(1);
		System.out.println(s2);
		
		
		
		
		System.out.println("------------------------------");
		
		Map<String,String> myMap=new HashMap<>();
		myMap.put("1234","Jay");
		myMap.put("1235","Vijay");
		
		String name=myMap.get("1234");
		System.out.println(name);
		
		System.out.println("---------------------");
		
		List<Integer> ints=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			ints.add(10);
		}
		int sum=ints.get(0)+ints.get(1);
		System.out.println(sum);
		
		
		System.out.println("---------------");
		
//		Number[] nums=new Number[5];
//		nums[0]=new Integer(1);
//		nums[1]=new Double[1.25];
		
//		Integer[] intArr=new Integer[5];
//		Number numArr=intArr;
		
	}

}
