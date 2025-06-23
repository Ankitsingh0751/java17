package com.lti.demos7.generics;

import java.util.ArrayList;
import java.util.List;

//Generics were introduced to the Java language to provide tighter type checks at compile time 
//and to support generic programming.
//To implement generics, the Java compiler applies type erasure to:



public class Bounds0 {
	
					//That String is a subtype of Object 
	//does not mean that List<String> is a subtype of List<Object>.
	
	
						// solution is List<?>
		/* static void func(List<Object> o, Object s){
	        o.add(s);
	    }*/
	
					//list of some type you don't know. 	
					//equivalent to List<?>, 
					//or List<? extends Object>
	 static void func(List o, Object s){
	        o.add(s);
	    }
	 
//https://itexpertsconsultant.wordpress.com/2016/04/24/difference-between-list-liste-listobject-and-list-in-java/
	public static void main(String[] args) {
		func(new ArrayList<String>(), new Integer(1));
		
		//That String is a subtype of Object 
		//does not mean that List<String> is a subtype of List<Object>.
		List<String> strings = new ArrayList<String>();
		//List<Object> objects = strings; //Type mismatch: cannot convert from List<String> to List<Object>
		//objects.add((Integer) 1);
		//strings.get(0).charAt(0); 
		
		
		// List<String> and List<Object> are subtypes of List<?>.
		//But because List<?> is the more general type, 
		//you can't know what type the add method takes:

		List<String> strings1 = new ArrayList<String>();
		List<?> objects1 = strings1;
		//objects1.add((Integer) 1); // does not compile
			
    }
}

//List is a list of some type you don't know. 
//It could be a List<String>, List<Integer>, etc.

 


