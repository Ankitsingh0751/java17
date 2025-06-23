package com.lti.collectionex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String,String> mailIds=new HashMap<String,String>();
		
		//insertion order not maintained
		mailIds.put("jay@gmail.com","psw1");
		mailIds.put("vijay@gmail.com","psw2");
		mailIds.put("sanjay@gmail.com","psw3");
		
		System.out.println(mailIds);
		
		 
	     Student s1=new Student(102,"Vijay",80);
	     Student s2=new Student(101,"Jay",70);
	     Student s3=new Student(103,"SanJay",90);
	     
	     Map<Integer,Student> stuMap=new HashMap<Integer,Student>();
	     stuMap.put(111111, s1);
	     stuMap.put(111222, s2);
	     stuMap.put(111333, s3);
	     
	     System.out.println(stuMap);
	     System.out.println("----------Using entryset-------");
	     for( Entry<Integer,Student>entrySet :stuMap.entrySet()) {
	    	 System.out.println(" Key :"+entrySet.getKey()+" Value "+entrySet.getValue());
	     }
	     
		

	}

}
