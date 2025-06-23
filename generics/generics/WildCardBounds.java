package com.lti.demos7.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//?" denotes any unknown type, It can represent any Type at in code for. 
	//Use this wildcard if you are not sure about Type.
	//for example, if you want to have an ArrayList which can work with any type 
	// it can be assigned to any type of ArrayList 


public class WildCardBounds {	

	//Covariance and contravariance 
	//Variance refers to  subtyping behaviour

	//Covariance: accept subtypes and are read only <? extends ..>
	//Contravariance: accept supertypes and are write only <? super ..> 

	//Arrays  are covariant, which has 2 implications.  // example Covarience 
	//Generics  : generics are invariant.
	//With wildcards, it’s possible for generics to support covariance and contravariance.
	
	
	
	
public static void main(String[] args) {

	ArrayList<Integer> numList3= new ArrayList<>();
	numList3.add(new Integer(100));		
	//numList1.add(new Long(100));	
	//numList.add(new String("100"));
	//numList.add(new Number(100));
	
	ArrayList<Integer> intArrList = new ArrayList<>();
	// ArrayList<Number> numArrList = intArrList; // Not ok

	
	ArrayList<Number> numList= new ArrayList<>(); 
	numList.add(new Integer(100));  
	numList.add(new Long(100));	     
	//numList.add(new String("100"));
	
	ArrayList<?> unknownList = new ArrayList<Number>();
	unknownList = new ArrayList<Float>();
	
	//<? extends T>
	//This is little restrictive than the previous one 
	//it will allow All Types which are either "T" or extends T means a subclass of T. 
	//for example List<? extends Number> can hold List<Number> or List<Integer>
	
	ArrayList<? extends Number> numberList = new ArrayList<Number>();
	numberList = new ArrayList<Integer>();  // these are references 
	numberList = new ArrayList<Float>();    // refering to list of child class types  


	ArrayList<? extends Number> numList1= new ArrayList<>(); 	  	
	//numList1.add(new Integer(100));  // this is operation add , why not allowed ----of Types Erasure 
	//numList1.add(new Long(100));	     
//	numList.add(new String("100"));	

	List<? extends  Integer> list = new ArrayList<>();	
			
		//list.add(new Integer(100));  // this is operation add , why not allowed ? --- Types Erasure 
			//list.add(new Number(100));
			//list.add(new Long(100));	   
			//List.add(new String("100"));
    				
	//<T super ?>
	//This is just opposite of previous one, 
	//It will allow T and super classes of T, e.g. List<? super Integer> can hold List<Integer> or List<Number>.

	ArrayList<? super Integer> numberList1 = new ArrayList<Integer>();
	numberList1 = new ArrayList<Integer>();
	//numberList1 = new ArrayList<Float>(); //compilation error1
	

	ArrayList<? super Number> numList2= new ArrayList<Number>(); 
	numList2.add(new Integer(100)); // can write 
	numList2.add(new Long(100));	     
	
	
	List<Number> numberList2 = new LinkedList<Number>();
	numberList2.add(Integer.valueOf(3));
	numberList2.add(Long.valueOf(Long.MAX_VALUE));
	printList(numberList2); // see below static method

}
private static void printList(List<? extends Number> printedList) {
	System.out.println("List: " + printedList);
	//printedList.add(new Integer(100));// Type was erased during compilation 
	
	}

}
