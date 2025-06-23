package com.lti.demos7.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Type erasure is the technique using which the Java compiler translates generic / parameterized type t
//o raw type in Java generics. Type erasure is applicable in the context of generics. 
//‘T’ is just a placeholder here and type erasure will remove it during compilation. 
//, type erasure does not completely erase the generics information and it retains type information as meta-data in binary class.
// type parameter like <T> are replaced by the left most bound type 
//and in case if there is no bound, then the type parameter is replaced by Object type.
//It means that a class contains no information about a type parameter. 
//This information is available only during compilation and is erased (becomes inaccessible) before runtime.
// bec what if jvm running codes for Java5 earlier version? 

class TestClass<T> {
	   private T value1;  // during compilation it becomes field becomes TestClass<Object>  -- private Object value1. 
	   private T value2;

	   public void printValues() {
	       System.out.println(value1);
	       System.out.println(value2);
	   }

	   public static <T> TestClass<T> createAndAdd2Values(Object o1, Object o2) {
	       TestClass<T> result = new TestClass<>();
	       result.value1 = (T) o1;
	       result.value2 = (T) o2;
	       return result;
	   }
  static class Cat {

	   }
	public static void main(String[] args) {
		
		 	Double d = 22.111;
	       String s = "Test String";
	       //check TestClass<Integer> if Type is Integer how come String types also got added ? 
	       // bec of type errasure 
	     //  TestClass<Integer> test = createAndAdd2Values(d, s);   
	     //  test.printValues();
	       
	       
	       List<String> strings = new ArrayList<>();
	       List<Integer> numbers = new ArrayList<>();
	       List<Cat> cats = new ArrayList<>();
	       
	       String str= "Hello";
	       System.out.println(str.getClass());//String class 
	       
	       //during compilation all  three lists become List<Object>
	       System.out.println(strings.getClass() == numbers.getClass()); //List variable --what's class ? 
	       System.out.println(numbers.getClass() == cats.getClass());
		
	       //Generics are subject to type erasure. Information about type parameters is not available at runtime. 
	       //By contrast, arrays know about and can use information about their data type when the program is running. 
	       Object x[] = new String[3];
	       x[0] = new Integer(222); // runtime error 
	       
	       //you cannot create an array of generic objects or even just a parameterized array.	       	      
	    		 //  new List<String>[];
	      // List<String>[] stringLists = new List<String>[1];	       
	      // https://codegym.cc/groups/posts/290-type-erasure
	       
	       
	       
	   
		
		//Type erasure is a process to remove these types and map it to raw type in byte code 
		//and it is done during compilation by the Java compiler.
		//You can take this as a near formal definition for type erasure. 
		//Java compiler replaces generic type information from source and 
		//adds casts as needed and delivers the byte code, 
		//generics related information are kept as meta-data in the bytecode for debugging, reflection purposes. 
		//With respect to general runtime execution, code will look like plain Java without generics.
		
		
		//At run-time the generic type is not available in general scenario, that’s what the type erasure does. 
		//There are scenarios where people accessing the generic type using reflection or non-java API.

		/*T instantiateElementType(List arg)
		{
		  return new T(); //causes a compilation error
		}*/
		 
	
		}

}
