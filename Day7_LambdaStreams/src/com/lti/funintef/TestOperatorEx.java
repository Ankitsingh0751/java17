package com.lti.funintef;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class TestOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<String> u1=String::toUpperCase;
		System.out.println(u1.apply("hello"));
		
		//Error:The type of isEmpty() from the type String is boolean, 
		//this is incompatible with the descriptor's return type: String
		//UnaryOperator<String> u2=String::isEmpty;
		

		UnaryOperator<String> u2=x->x.toUpperCase();
		System.out.println(u2.apply("mansi"));
		
		BinaryOperator<String> b1=String::concat;
		BinaryOperator<String> b2=(string,toAdd)->string.concat(toAdd);
		System.out.println(b1.apply("mansi"," saxena"));
		System.out.println(b2.apply("Hello", "World"));
	}

}
