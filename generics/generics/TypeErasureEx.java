package com.lti.demos7.generics;

//Type erasure can be explained as the process of enforcing type constraints only at compile time
//and discarding the element type information at runtime.

// Types of Type Erasure : https://www.baeldung.com/java-type-erasure
//https://www.geeksforgeeks.org/type-erasure-java/
//https://stackoverflow.com/questions/339699/java-generics-type-erasure-when-and-what-happens
//1. class type erasure 
//public class Stack<E> { private E[] stackContent;
// replaced with public class Stack { private Object[] stackContent;

//2. Method Type Erasure
//public static <E> void printArray(E[] array) { for (E element : array) {
//public static void printArray(Object[] array) { for (Object element : array) {

//3.Edge Cases


/*
Generic <T> Operations, Erasure
• In the source code implementing the generic class, T may be used to declare variables and return types,
and may be used to declare local generic variables, such as a List<T>. Essentially, T behaves like a 
real type such as String or Integer. 
• At a later stage in the compilation, T is replaced by Object. So at run-time, the notion of T is gone -- it's 
just Object by then. This is known as the "erasure" system, where T plays its role to check the sources 
early in compilation, but is then erased down to just plain Object. 
• Remember: where you see T, it is just replaced by Object to produce the code for runtime. So the 
ArrayList<String> code and the ArrayList<Integer> code … those two are actually just the 
ArrayList<Object> code at runtime. 
• The erasure system provides basic generic type checking at compile time. The erasure approach is a 
compromise that adds generics to Java while remaining compatible with pre Java 5 systems.

*/

public class TypeErasureEx {
	
	public static  <E> boolean containsElement(E [] elements, E element){
	    for (E e : elements){
	        if(e.equals(element)){
	            return true;
	        }
	    }
	    return false;
	}
	//The compiler replaces the unbound type E with an actual type of Object:

/*	public static  boolean containsElement(Object [] elements, Object element){
	    for (Object e : elements){
	        if(e.equals(element)){
	            return true;
	        }
	    }
	    return false;
	}*/
	public static void main(String[] args) {
		
		
		 
		
		
	}

}
