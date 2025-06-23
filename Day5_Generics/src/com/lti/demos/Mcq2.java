package com.lti.demos;

import java.util.ArrayList;
import java.util.List;

public class Mcq2 {

	class A {}

	class B extends A {}

	class C extends B {}

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<?> list1 = new ArrayList<A>();

		List<? extends A> list2 = new ArrayList<A>();


		List<? extends A> list21 = new ArrayList<B>();
		List<? extends A> list213 = new ArrayList<C>();

		

		List<? extends B> list3 = new ArrayList<C>();
		
		//List<? extends B> list31 = new ArrayList<A>();

		List<? extends B> list32 = new ArrayList<B>();

		List<? extends C> list4 = new ArrayList<C>();
		
		
		List<? super A> list5 = new ArrayList<A>();

		//List<? super A> list6 = new ArrayList<B>();

		//List<? super A> list7 = new ArrayList<C>();



		List<? super B> list9 = new ArrayList<B>();

		List<? super B> list10 = new ArrayList<A>();

		//List<? super B> list10= new ArrayList<C>();

	}

}
