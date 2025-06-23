package com.lti.demos7.generics;

import java.util.List;

//Wildcard bound types ? T 

 class Wildcard {
	 public void showSize(List<?> list) {
	 System.out.println("\n size of list" +list.size());
	 }
 }
//Generics is not restricted to the predefined classes in the Java API's. 
public class Hello<T> {  // Integer
	T t;  // Integer t 
	public Hello(T t) {  // Hello(Integer t)
		this.t = t;
	}
	public String toString() {
		return t.toString();
	}
	public static void main(String[] args) {		
		
		System.out.print(new Hello<String>("hi"));
		System.out.println(new Hello<Integer>(100));		
		
		Hello h= new Hello("Welcome");
		System.out.println(h.t);		
		
		Hello<String> h1= new Hello<>("Welcome");
		System.out.println(h1.t);
		
		Hello<Integer> h2= new Hello<>(100);  // 
		System.out.println(h2.t);
				
		Hello<Number> h3= new Hello<>(100);  // 
		System.out.println(h3.t);
				
		//List arrList1 = new ArrayList<>(); not allowed 
		// User defined classes  allows 
		
		Hello h4= new Hello<Number>(100);  // 
		System.out.println(h3.t);
		
		
		
		
		/*
		
		
		//List myList= new ArrayList();
		LinkedList myList=new LinkedList();
		//Set myList= new HashSet();
		myList.add(10);
		myList.add(20);
		myList.add(30);			
		
		Wildcard card = new Wildcard();
		card.showSize(myList);
		
		
		
		//we have used generics at one more place 
		
		Map<Integer, String> map = new HashMap<Integer, String>();

		Integer key1   = new Integer(123);
		String  value1 = "value 1";

		map.put(key1, value1);

		String value1_1 = map.get(key1);

		
		
		/*Set<? extends Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		numbers.add(new Integer(86));		
		numbers.add(309L);
		Iterator iter = numbers.iterator();
		while (iter.hasNext())
			System.out.print(iter.next());*/
		
		
		
		 //ArrayDeque<?> list = new ArrayDeque<String>();
	  // ArrayList<? super Date> list = new ArrayList<Date>();
		 //List<?> list = new ArrayList<?>();
		 //List<Exception> list = new LinkedList<java.io.IOException>();
		// Vector<? extends Number> list = new Vector<Integer>();
		
//		*
	}
}