package com.lti.demos;

public class DataHolderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataHolder<String> personalDetails=new DataHolder<String>();
		personalDetails.add("Jay");
		personalDetails.add("Vijay");
		
		System.out.println(personalDetails.get(0));
		System.out.println(personalDetails.get(1));
		
		
		DataHolder<Integer> mobilenum=new DataHolder<Integer>();
		mobilenum.add(123456);
		mobilenum.add(7897564);
		
		System.out.println(mobilenum.get(0));
		System.out.println(mobilenum.get(1));

	}

}
