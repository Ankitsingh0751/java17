package com.lti.demos7.generics;

//Functions are contravariant in their arguments and covariant in their return values.
/// covariant accept subtypes and are read only 
class A { 
}
class B extends A {
}
//Helper class (Base class)
class Base {
 // Method of this class of class1 return type
	Integer method() // Number also works // try Integer in der class 
	{
		Integer I= new Integer(100);
		return I;
	}
	
 A fun()
 {
     System.out.println("Base fun()");
     return new A();
 }
}
//Helper class extending above class
class Derived extends Base {
 // Method of this class of class1 return type	
	Integer method()
	{
		Integer I= new Integer(100);
		return I;
	}
 B fun()
 {
     System.out.println("Derived fun()");
     return new B();
 }
}


//Contravarience :accept supertypes and are write only 

class Super{
	  void doSomething(String parameter) {}
	}
class Sub extends Super{
	  void doSomething(Object parameter) {}
	}


public class CovarienceFunction {
 public static void main(String args[])
 {
     Base base = new Base();   
     base.fun();
     Derived derived = new Derived();
     derived.fun();
     
     
     
     
 }
}
//Actual use of these concepts :


/*
 * Co-variance: Iterable and Iterator.
 *  It almost always makes sense to define a co-variant Iterable or Iterator.
 *   Iterator<? extends T> can be used just as Iterator<T> - the only place where the type 
 *   parameter appears is the return type from the next method, 
 *   so it can be safely up-cast to T. But if you have S extends T, 
 *   you can also assign Iterator<S> to a variable of type Iterator<? extends T>. 
 *   For example if you are defining a find method:

boolean find(Iterable<Object> where, Object what)
you won't be able to call it with List<Integer> and 5, so it's better defined as

boolean find(Iterable<?> where, Object what)
Contra-variance: Comparator. 
It almost always makes sense to use Comparator<? super T>,
 because it can be used just as Comparator<T>. 
 The type parameter appears only as the compare method parameter type, 
 so T can be safely passed to it.
  For example if you have a DateComparator implements Comparator<java.util.Date> { ... } 
  and you want to sort a List<java.sql.Date> 
  with that comparator (java.sql.Date is a sub-class of java.util.Date), you can do with:

<T> void sort(List<T> what, Comparator<? super T> how)
but not with

<T> void sort(List<T> what, Comparator<T> how)

*/
