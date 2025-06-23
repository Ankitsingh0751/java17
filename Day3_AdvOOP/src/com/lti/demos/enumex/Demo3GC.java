package com.lti.demos.enumex;


//Garbage collection refers to the process of automatically freeing memory on the heap by  deleting objects that are no longer reachable in your program.
//System.gc() is not guaranteed to run,

//memory belonging to an object can be reclaimed. 
//Java waits patiently until the code no longer needs that memory. 
//An object will remain on the heap until it is no longer reachable. 
//An object is no longer reachable when one of two situations occurs: 
//The object no longer has any references pointing to it. 
//All references to the object have gone out of scope. 

public class Demo3GC {
	
	//The finalize() method is called the finalizer.
	public void finalize() {

		System.out.println("Calling finalize"); // finalize() call could run zero or one time.
	}


	public static void main(String[] args) {

		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;
		String three = one;		
		System.out.println(three);
		
		one = null;
		Demo3GC d = new Demo3GC();	
		d.finalize();

		System.gc(); // not guaraented
	}

}
/***
* Garbage Collection: The heap, also known as free store, represents a giant
* pool of unused memory allocated to your Java application; - System.gc()
* suggests that now might be a good time for Java to kick off a garbage
* collection run, but is not guaranteed that Java will run it; An object is no
* longer reachable when one of two situations occurs: - The object no longer
* has any references pointing to it; - All references to the object have gone
* out of scope. The method finalize() might not be called and it definitely
* won't be called twice to collect the object from the heap. Obs.: Objects are
* always on the heap.
*/
