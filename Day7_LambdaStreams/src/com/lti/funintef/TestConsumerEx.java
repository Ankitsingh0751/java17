package com.lti.funintef;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* Customer is a pre-defined interface having 
 * a method- accept()
 * which has one prameter
 * and no return type
 * */

public class TestConsumerEx {

	public static void main(String[] args) {

		Consumer<String> c1=(str)->{
			System.out.println("Welcome");
			System.out.println(str);
		};
		c1.accept("Mansi");

		Consumer<String> c2=System.out::println;
		c2.accept("Nikhil");
		System.out.println("---------------------------");
	List<String> list=Arrays.asList("Jayant","Anirudha","Venkat","Nitiket");
		
		//enhanced for loop
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("-----------forEach----------------");
		
		//accepts super class of string
		//internally use consumer functional interface -> use accept method
		//supports lambda
		list.forEach((s)->System.out.println(s));
		
		
		System.out.println("-------------Convenience methods-------------------");
		Consumer<String> s1= x->System.out.print("1 "+x);
		Consumer<String> s2= x->System.out.print("2 "+x);
		
		Consumer<String> combined=s1.andThen(s2);
		combined.accept("Hello");
		
//
//		BiConsumer<String,String> twocombined=(BiConsumer<String, String>) s1.andThen(s2);
//		combined.accept("Hello","Bye");
	}

}
