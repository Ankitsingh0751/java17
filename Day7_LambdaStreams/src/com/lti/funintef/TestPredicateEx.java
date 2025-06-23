package com.lti.funintef;

import java.util.function.Predicate;

/* had boolean return type
 * One parameter
 * */
public class TestPredicateEx {

	public static void main(String[] args) {

		Predicate<String> p=(s)->s.contains("a") && s.contains("j");
		
		boolean ans=p.test("Shravan");
		System.out.println(ans);
		System.out.println(p.test("Jalaj"));
		
		System.out.println("---------isEmpty--------");
		Predicate<String> p2=String::isEmpty;
		System.out.println("1 "+p2.test("Hello"));
		
		Predicate<String> p3=x->x.isEmpty();
		System.out.println("2 "+p3.test(""));
		
		System.out.println("-------contentEquals--------");
		Predicate<String> p4=str-> str.contentEquals("abc");
		String toBeTested="abc";
		//test predicate with another String;
		boolean result=p4.test(toBeTested);
		
		if(result) {
			System.out.println("Strings matched");
			
		}
		else {
			System.out.println("String do not match");
		}
		
		System.out.println("-------------Functional Interface-------------------");
//
		Predicate<String> egg=(s)->s.contains("egg");
		Predicate<String> brown=(s)->s.contains("brown");
		Predicate<String> brownEggs=egg.and(brown);
		Predicate<String> otherEggs=egg.and(brown.negate());
		
		boolean ans1=brownEggs.test("brownegg");
		System.out.println(ans1);
		
		boolean ans2=otherEggs.test("otheregg");
		System.out.println(ans2);

		boolean ans3=otherEggs.test("brownegg");
		System.out.println(ans3);

		
		


	}

}
