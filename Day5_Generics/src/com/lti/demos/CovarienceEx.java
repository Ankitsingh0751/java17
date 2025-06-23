package com.lti.demos;
//https://hajsoftutorial.com/java-type-erasure/
import java.util.ArrayList;
import java.util.List;

//Covariance and contravariance 
//Variance refers to  subtyping behaviour

//Covariance: accept subtypes and are read only <? extends> upper bound
//Contravariance: accept supertypes and are write only <? super> lower bound
//Arrays  are covariant, which has 2 implications.
//Generics  : generics are invariant.
//With wildcards, it’s possible for generics to support covariance and	 contravariance.


public class CovarienceEx {

	public static void main(String[] args) {
		
		
		//Arrays are Covarient
		//means those that accepts subtype
		Number[] numbers=new Number[3]; // Number - SuperClass
		numbers[0]=new Integer(100);//Integer- Subclass
		numbers[1]=new Double(3.14);
		
		Integer[] intAry=new Integer[3];
		//intAry[0]=new Number(1000); //Cannot instantiate the type Number //Number is an interface
		
		//intAry=numbers;//Type mismatch: cannot convert from Number[] to 

			numbers=intAry;
			Integer[] myInts= {1,2,3,4};
			Number[] myNos=myInts;
			//myNos[0]=3.14;//At runtime ArrayStoreException(heap pollution)
			
			//Generics are invarients
			List<Integer> myInts1=new ArrayList<Integer>();
			myInts1.add(100);
			//myInts1.add(200.00); //Error as typecasted
			
			
			//List<Number> myNums=myInts1; : Compilation error
			
			//Generics - Type Erasure
			//During compilation only all types are erased
	
			ArrayList<Integer> myInts2=new ArrayList<Integer>();
			ArrayList<?> unknownList=new ArrayList<Number>();
			unknownList=new ArrayList<Float>();
			unknownList=new ArrayList<Integer>();
			unknownList=myInts2;
			
			//<? extends T>
			//allows all types Type T-and subclass Type
			
			ArrayList<? extends Number> numberList=new ArrayList<Number>();//Read only List//Can't  write
			numberList=new ArrayList<Integer>();
//			numberList=new ArrayList<Float>();
//			numberList.add(new Integer(100));
			
			
			//<? super T>
			//allows T and Super classes of T
			
			ArrayList<? super Integer> intList=new ArrayList<Integer>();
			intList=new ArrayList<Integer>();
			//intList=new ArrayList<Float>();//not a superclass
			intList=new ArrayList<Number>();
			intList.add(new Integer(100));// write-only
			
			
			List<Number> numList=new ArrayList<Number>();
			numList.add(Integer.valueOf(3));
			numList.add(Long.valueOf(2451));
			printList(numList);
			
			
			
			
	
	
	}
	static void printList(List<? super Number> numList) {
		System.out.println("List" + numList);
		numList.add(new Integer(100));
		System.out.println("List" + numList);
	}

}
