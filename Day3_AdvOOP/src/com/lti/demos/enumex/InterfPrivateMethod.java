package com.lti.demos.enumex;


//https://howtodoinjava.com/java9/java9-private-interface-methods/



/*
Since java 9, you will be able to add private methods and private static method in interfaces.

These private methods will improve code re-usability inside interfaces. 
For example, if two default methods needed to share code, 
a private interface method would allow them to do so, 
but without exposing that private method to it’s implementing classes.

Using private methods in interfaces have four rules :

Private interface method cannot be abstract.
Private method can be used only inside interface.
Private static method can be used inside other static and non-static interface methods.
Private non-static methods cannot be used inside private static met*/
interface CustomInterface {
  
  public abstract void method1();
   
  public default void method2() {
  	 System.out.println("default method 2");
      method4();  //private method inside default method
      method5();  //static method inside other non-static method
     
  }
   
  public static void method3() {
      method5(); //static method inside other static method
      System.out.println("static method");
  }
   
  private void method4(){
      System.out.println("private method 4");
  } 
   
  private static void method5(){
      System.out.println("private static method 5");
  } 
}

public class InterfPrivateMethod implements CustomInterface{
	@Override
  public void method1() {
      System.out.println("abstract method");
  }

	    public static void main(String[] args){
	        CustomInterface instance = new InterfPrivateMethod();
	        instance.method1();
	        instance.method2();
	        CustomInterface.method3();
	    }
	

}
