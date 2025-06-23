package com.lti.funintef;

import java.util.function.BiFunction;

public class TestBiFunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,String> b1=String::concat;
		BiFunction<String,String,String> b2=(string,toadd)->string.concat(toadd);
		System.out.println(b1.apply("baby", "chick"));
		System.out.println(b2.apply("baby", "chick"));
		
		System.out.println("----------addition using biFunction--------------");
		
		BiFunction<Integer,Integer,Integer> add1=(n1,n2)->n1+n2;
		System.out.println(add1.apply(14,22));
		
		BiFunction<Integer,Double,Double> add2=(n1,n2)->n1+n2;
		System.out.println(add2.apply(100, 200.87));
		
		System.out.println("--------Concatination-------------");
		BiFunction<String,String,String> fun=(x,y)->x.concat(y);
		System.out.println(fun.apply("Java","11"));
		
	}

}
