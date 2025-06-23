package com.lti.demos7.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/*
 * 
If you have a field that is a generic type, its type parameters are compiled into the class.

If you have a method that takes or returns a generic type, those type parameters are compiled into the class.

This information is what the compiler uses to tell you that 
you can't pass a Box<String> to the empty(Box<T extends Number>) method.


If you have code that uses a generic type, the compiler inserts casts as needed (in the caller) to check types. 
The generic objects themselves are just the raw type; the parameterized type is "erased". 
So, when you create a new Box<Integer>(), there is no information about the Integer class in the Box object.
 */


// uncheked warnings :
/*A warning by which the compiler indicates that it cannot ensure type safety.
The term "unchecked" warning is misleading.  
It does not mean that the warning is unchecked in any way. 
 The term "unchecked" refers to the fact that
  the compiler and the runtime system do not have enough type information 
  to perform all type checks that would be necessary to ensure type safety.
   In this sense, certain operations are "unchecked". 
The most common source of "unchecked" warnings is the use of raw types. 
// "unchecked" warnings are issued when an object is accessed through a raw type variable,
 *  because the raw type does not provide enough type information to perform all necessary type checks. 
*/
//https://docs.oracle.com/javase/tutorial/java/generics/why.html

//http://www.angelikalanger.com/GenericsFAQ/FAQSections/TechnicalDetails.html#FAQ001
class TestClass1 {

		
	public static void main(String[] args) {
		
		  List myList = new ArrayList();
		  
		  myList.add("abc");        // unchecked warning
		//read Type safety: The method add(Object) belongs to the raw type ArrayList. 
		//References to generic type ArrayList<E> should be parameterized
		
		//meaning :
		//When the add method is invoked the compiler does not know whether it is safe to add a String object to the collection.  
		//If the ArrayList is a collection that contains String s (or a supertype thereof), then it would be safe.
		//But from the type information provided by the raw type ArrayList the compiler cannot tell. 
		//Hence the call is potentially unsafe and an "unchecked" warning is issued. 
		
		//How to remove these warnings 
		//way 1. "unchecked" warnings are also reported when the compiler finds a cast 
		  //whose target type is either a parameterized type or a type parameter. 
	
		  //Raw types.  java 5 compatible Collection came after that version 
	//remove using List<String> , List<Object> 	
		
		    
			System.out.println("\n ");
			Map genericsMap = new HashMap();
			
			genericsMap.put("1954", "FORTRAN");
			//String language = genericsMap.get("1954"); //Type mismatch: cannot convert from Object to String
			//System.out.println("Language: " + language);
			
//			/ we instantiate a generic map using the parameterized type as String for generic type. 
			//It provides us the type safety and helps avoid the need for explicit casting.
			
			Map<String,String> genericsMap1 = new HashMap<>();	
			genericsMap1.put("1954", "FORTRAN");
			String language = genericsMap1.get("1954"); 
			System.out.println("Language: " + language);
			
			//Javadoc 
			//https://docs.oracle.com/javase/tutorial/java/generics/why.html

			
			//Why Use Generics?
				//1. generics enable types (classes and interfaces) to be parameters when defining classes,interfaces and methods. 
			//	type parameters provide a way for you to re-use the same code with different inputs. 
			//The difference is that the inputs to formal parameters are values,
			//while the inputs to type parameters are types.

				
				//2.	Stronger type checks at compile time.
					// Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.

					//3. Elimination of casts.
					//The following code snippet without generics requires casting:
					List list = new ArrayList();
					list.add("hello");
					String s = (String) list.get(0);
					
					//When re-written to use generics, the code does not require casting:
					List<String> list1 = new ArrayList<String>();
					list1.add("hello");
					String s1 = list1.get(0);   // no cast
					
					//4. Enabling programmers to implement generic algorithms.
					// programmers can implement generic algorithms that work on collections of different types,
					//can be customized, and are type safe and easier to read.
			
				//Generic Types 
					//1. A Generic Version of the A Class
					//DataHolder Example Or Javaapp example 
					
					// Multiple Type Parameters 
				     //Javaapp3 example 
					
					//Invoking  and Instantiating a Generic Type -- Diamond 
					
					//Parameterized Types  					
					//	OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(...));
					
					//Raw Types
					//A raw type is the name of a generic class or interface without any type arguments. 
					// starting example warning 
					
					//Bounded Type Parameters
					//There may be times when you want to restrict the types that can be used as type arguments in a parameterized type. 
					//For example, a method that operates on numbers might only want to accept instances of Number or its subclasses. 
					//This is what bounded type parameters are for.
					//Bounds2  Or WildCardBounds  Or GenericsTester
					
					
					// the question mark (?), called the wildcard, 
					//represents an unknown type. The wildcard can be used in a variety of situations: as the type of a parameter, field, or local variable; sometimes as a return type (though it is better programming practice to be more specific). 
					//The wildcard is never used as a type argument for a generic method invocation, a generic class instance creation, or a supertype.
					
					//**** https://docs.oracle.com/javase/tutorial/java/generics/inheritance.html
					
					//Generics, Inheritance, and Subtypes
					
					Object someObject = new Object();
					Integer someInteger = new Integer(10);
					someObject = someInteger;   // OK
					
				//	public void someMethod(Number n) { /* ... */ }

				//	someMethod(new Integer(10));   // OK
				//	someMethod(new Double(10.1));   // OK


				/*	Box<Number> box = new Box<Number>();
					box.add(new Integer(10));   // OK
					box.add(new Double(10.1));  // OK
					//Now consider the following method:*/

					//public void boxTest(Box<Number> n) {  }
					//This is a common misunderstanding when it comes to programming with generics,
					//but it is an important concept to learn.
						//see image : generics-subtypeRelationship.gif
					
					//Restrictions on Generics
					//https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html
	
	}
   
        
	}

