package com.lti.funintef;

/*two parameter
 * boolean return type
 * method name- test()
 * */


import java.util.function.BiPredicate;

public class TestBiPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String,String> b1=String::startsWith;
		
		BiPredicate<String,String> b2=(string,prefix)->prefix.startsWith(string);
		
		System.out.println(b1.test("chicken","chick"));
		System.out.println(b2.test("mansi","si"));
		

	}

}
