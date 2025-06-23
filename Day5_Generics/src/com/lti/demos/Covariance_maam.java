package com.lti.demos;


//A generic type is a generic class or interface that is parameterized over types.”

//Essentially, generic types allow you to write a general, generic class (or method) that works with different types, allowing for code re-use.

import java.util.ArrayList;


import java.util.List;

//https://dzone.com/articles/covariance-and-contravariance

//Covariance and contravariance 
//Variance refers to  subtyping behaviour
//Covariance: accept subtypes and are read only 
//Contravariance: accept supertypes and are write only 
//Arrays  are covariant, which has 2 implications.
//Generics  : generics are invariant.
//With wildcards, it’s possible for generics to support covariance and	 contravariance.


//https://medium.com/free-code-camp/understanding-java-generic-types-covariance-and-contravariance-88f4c19763d2


public class Covariance_maam{
	public static void main(String[] args) {
		
		//Arrays  are covariant, which has 2 implications.
		// Firstly, an array of type T[] may contain elements of type T and its  subtypes.
		
		//because Java knows at runtime that the “actual object” intArr is actually an array of Integer.
		
		Number[] nums = new Number[5]; 
		nums[0] = new Integer(1); // Ok  
		nums[1] = new Double(2.0); // Ok
		
		// Secondly, an array of type S[] is a subtype of T[] if S is a subtype of T.		
		
		Integer[] intArr = new Integer[5];
		Number[] numArr = intArr; // Ok accept subtype 
		
	//or  
		Integer[] myInts = {1,2,3,4};
		Number[] myNumber = myInts;
		
//		But this subtyping rule can lead to an interesting question: what would happen if we try to do this?

		numArr[0] = 1.23; // Not ok   produce a runtime ArrayStoreException (because of heap pollution):
		 //because Java knows at runtime that 
		//numArr is a reference of reference type Number[] to the “actual object” intArr of “actual type” Integer[]		
					
		// https://docs.oracle.com/javase/tutorial/java/generics/subtyping.html
		

		//This means that we can fool the compiler, but we cannot fool the run-time type system. 
		//This means that at run-time Java knows that this array was actually
		//instantiated as an array of integers which simply happens to be accessed through a reference of type Number[].

		
		//The Problem with Java Generics is Type Erasure :
		// type information for type parameters is discarded by the compiler after the compilation of code is done; 
		//therefore this type information is not available at run time. 
		 
		List<Integer> myInts1 = new ArrayList<Integer>();
		myInts1.add(1);
		myInts1.add(2);
		//List<Number> myNums = myInts1; //compiler error
		//myNums.add(3.14); //heap polution
		
		
		
		
			
		//Generics  : generics are invariant.
				//Java has no way of knowing at runtime the type information of the type parameters, 
				//due to type erasure. Therefore, it cannot protect against heap pollution at runtime.

				ArrayList<Integer> intArrList = new ArrayList<>();
				//ArrayList<Number> numArrList = intArrList; // Not ok
				//ArrayList<Integer> anotherIntArrList = intArrList; // Ok			
				
				//Although Integer is a subtype of Number, 
				//List<Integer> is not a subtype of List<Number> and, in fact, these two types are not related.
				// The type parameters must match exactly, to protect against heap pollution.

				
				//Wildcards, covariance, and contravariance
				//With wildcards, it’s possible for generics to support covariance and contravariance.
				
		// Now wildcard bound unbound comes in picture 

		//wildcard and subtyping 		
						
		// above same example, see how it  works!
		ArrayList<Integer> intArrList1 = new ArrayList<>();
		ArrayList<? extends Integer> numArrList = intArrList1; // Ok

		// The question mark “?” refers to a wildcard which represents an unknown type.
		//lower bound wildcard 
		//  ? super Integer translates to “any type that is an  Integer type or its supertype”.
		//  upper-bound the wildcard, which restricts the unknown type to
		// be a specific type or its subtype,
		// by using ? extends Integer.

		
		////Covariance: types 
		// Read-only and write-only
		// Covariance and contravariance produce some interesting outcomes.
		// Covariant types are read-only, while contravariant types are write-only.

		// Remember that covariant types accept subtypes, so ArrayList<? extends Number>
		// can contain any object that is either of a Number type or its subtype.
	
		//Covariance : accept subtypes and are read-only,
		ArrayList<Integer> ints1 = new ArrayList<>();
		ArrayList<? extends Number> nums1 = ints1; //whatever we get from the ArrayList can be upcasted to a Number type (because if it extends Number, 

		ints1.add(new Integer(1)); // Ok
		Number n = nums1.get(0); // Ok  // we can get / read from list 
		// nums1.add(new Integer(2)); // Not ok  // we can't add /can't write //because we cannot be sure of the “actual type” of the object.

		// because we can be certain that whatever we get from the ArrayList can be
		// upcasted to a Number type (because if it extends Number, by definition, it is a Number).
		// But nums.add() doesn’t work, because we cannot be sure of the “actual type” of the object.
		// All we know is that it must be a Number or its subtypes (e.g. Integer, Double, Long, etc.).

		 // contravariance, accept supertypes and are write only 
		//All that List<? super Integer> means is the List is capable of consuming an object of type Integer or some supertype of Integer.
		//A List<? super Number> meets those requirements.

		ArrayList<Integer> ints2 = new ArrayList<>();
		ArrayList<? super Integer> nums2 = ints2;

		ints2.add(new Integer(1)); // Ok  // can Write 
		nums2.add(new Integer(2)); // Ok
		// Integer n = nums2.get(0); // Not ok  // can't read 

		
		//so overall rule of thumb:
		// “Producer extends, consumer super”.
		
		
		

	}

}

