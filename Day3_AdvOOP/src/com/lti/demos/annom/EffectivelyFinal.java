package com.lti.demos.annom;

//effectively final  
public class EffectivelyFinal {
 private final int length = 5;  // pure Final Variable     
 
 public void calculate() {    	
 	
 	//after java 8 , no need to write final keyword    	
 	int width=20 ; // effectively final     	
 	//width=100; //will not act as final , and can't use within inner class 
 
 class Inner {
         public static final int CONSTANT = 1;           
       
         public void multiply() {            
         	//width=100;  
         System.out.println(length );  // inner classes can't use effectvely final variable 
             System.out.println(CONSTANT);              
         }
     }
     Inner inner = new Inner();
     inner.multiply();
 }
 public static void main(String[] args) {
     EffectivelyFinal outer = new EffectivelyFinal();
     outer.calculate();
 }


}

