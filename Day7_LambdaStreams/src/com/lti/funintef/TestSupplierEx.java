package com.lti.funintef;

import java.time.LocalDate;
import java.util.function.Supplier;

/*Supplier is a ready-made interface 
 * having one pre-build/Single Abstract method get()
 * It has no parameter
 * and one return type
 * Supplier<return type>
 */

public class TestSupplierEx {

	public static void main(String[] args) {
		
		Supplier<LocalDate> s1=()->LocalDate.now();
		
		LocalDate d1=s1.get();
		System.out.println(d1);
		
		Supplier<StringBuilder> s2=()->new StringBuilder("Hello OCP Batch");
		System.out.println(s2.get());
		
		//Type mismatch: cannot convert from StringBuilder to String
			//Supplier<String> s3=()->new StringBuilder("Hello OCP Batch");
		
		//Type mismatch: cannot convert from String to StringBuilder
			//Supplier<StringBuilder> s3=()->new String("Hello OCP Batch");
		
//		Supplier<Number> num=()->new Double(58.000);
//		Supplier<Number> num=()->4586;
//		Supplier<Number> num=()->new Integer(58);
		
		/*
		 * ERROR:
				Supplier<Double> num=()->new Integer(58);
			Multiple markers at this line
				- Type mismatch: cannot convert from Integer to 
				 Double
				- The constructor Integer(int) is deprecated since 
				 version 9
				 
		2) error:
			Supplier<Integer> num=()->new Double(58);
			- Type mismatch: cannot convert from Double to Integer 
				 
			
		
		*/
		Supplier<Number> num=()->new Integer(58);
		
		System.out.println(num.get());
		
		
		
		

	}

}
