package com.lti.demos7.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsBasics {
	
	//List<?> means you can assign any type of List to it, it should not throw a compile-time error when we assign List<String> or List<Integer>, 
	//but you cannot do the same with List<Object>. 

	//Similarly, you can store String, Integer, Float, or whatever you want into List<Object>
	//but you can't do that with List<?> because type is unknown.


	//inside the method, when you try to read values, both List<?> and List<Object> will work,
	//but when you try to add objects, the List<?> will give an error because the type is unknown.

	//The compiler doesn't know what types are valid for that List hence it cannot provide type safety guarantee,
	//hence it throws an error, but this is not the case with List<Object>.
	//Here compiler does know that it is a list of Object and since every class, simplicity extends java.lang.Object, 
	//you can store anything in this list like String, Integer, Float etc.

//the real differnece between List<?> and List<Object> comes depending upon what you are trying to do with them.]
	//If you are just reading objects, I mean printing elmeents from a list using enhanced for loop then both are ok,
	//but if you want to add elements then you should use List<Object>. 

	
	public static void printElements(List<?> listOfUnknownType)
	{ 
		//listOfUnknownType.add("abc");	// compile time error 
		for (Object o : listOfUnknownType) 
		{ System.out.println(o); // OK 
		} 
		
	} 
	
	public static void printObjects(List<Object> listOfObjects)
	{ 
		listOfObjects.add("abc"); // OK 
		listOfObjects.add(101); // OK 
		for (Object o : listOfObjects) 
		{ System.out.println(o); // OK 
		}
		
	}
	
	public static void main(String[] args) {
		
		//List<?> and List<Object> -->looks similar 
		
		//but 
		//the List<?> is basically a list of any type,
		//you can assign a list of String like List<String> or list of Integer i.e. List<Integer> to it. 
		
		// it uses the unbounded wildcard <?>, which means any type. 
		
		//It provides it the much needed Polymorphism requires while writing Generic methods. 

		//if your method has a type List<?> which means you can pass any type of List to it, 
		//but remember the type is unknown until you assign it like:

		//List<?> myList = new List<String>(). 

		//List<Object>, it's no different than a List<String> it just that it will only accept Objects instead of String. 
		
		//Now, since every class in Java extends Object, they are essentially objects, 
		//which means you can store any type of Object in this list. 

		//Read carefully, 
		
		//the List<?>   means you can assign any type of List to it a
		// List<Object> means you can store any type of object into it.
		
		
		printElements(new ArrayList<String>()); // OK  you can pass ArrayList<String> and ArrayList<Integer> to the printElements() method it uses List<?> as a method argument which can accept any type of List. 

		printElements(new ArrayList<Integer>()); // OK 
		//printObjects(new ArrayList<String>()); // NOT OK compile time error 
		//printObjects(new ArrayList<Integer>()); // NOT OK compile time error

		// throws an error because it can only accept a list of objects and nothing else. 
		
		//This also means you should prefer bounded wildcards while writing API, e.g., method arguments and return types.


		}

}
