package com.lti.demos7.generics;

import java.util.ArrayList;
import java.util.List;

public class CovarienceEx {
	
	public static void main(String[] args) {
	//	Arrays Are Covariant //	an array of type T[] may contain elements of type T or any subtype of T. 

		Number[] numbers = new Number[3];
		numbers[0] = new Integer(10);
		numbers[1] = new Double(3.14);
	
	
		//But not only that, the subtyping rules of Java also state that an array S[] is a subtype of the array T[]
		//if S is a subtype of T, therefore, something like this is also valid:

		Integer[] myInts = {1,2,3,4};
		Number[] myNumber = myInts;
	
	//	But this subtyping rule can lead to an interesting question: what would happen if we try to do this?

		myNumber[0] = 3.14; //attempt of heap pollution runtime exception , we would get an ArrayStoreException 
		
		//This means that we can fool the compiler, but we cannot fool the run-time type system. 
		//And this is so because arrays are what we call a reifiable type. 
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
		
	}

}
