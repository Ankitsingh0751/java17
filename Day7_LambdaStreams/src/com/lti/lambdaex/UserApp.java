package com.lti.lambdaex;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MaxFinder mf=new MaxFinderImpl();
//		int no=mf.max(100,200);
//		System.out.println(no);
		
		MaxFinder mf=(num1,num2)->num1>num2?num1:num2;
		
		int no=mf.max(3000, 600);
		System.out.println(no);

	}

}
/*

/*
 
A lambda expression is an kind of anonymous function

 Simply put, it’s a method without a declaration, i.e., access modifier, 
 return value declaration, and name.
 * 
 * Lambda expressions basically express instances of functional interfaces
 (An interface with single abstract method is called functional interface. An example is java.lang.Runnable).
 Comparable Comparator --> 
 
 lambda expressions implement the only abstract function and  therefore implement functional interfaces

lambda expressions are added in Java 8 and provide below functionalities.

Enable to treat functionality as a method argument, or code as data.
A function that can be created without belonging to any class.
A lambda expression can be passed around as if it was an object and executed on demand.

*/
