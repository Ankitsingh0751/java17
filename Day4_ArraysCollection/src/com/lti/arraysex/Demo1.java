package com.lti.arraysex;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s;
//		Student s1[];
		char[] chAry[];
//		int[5] a;
//		int[] p,[]b;int 
		
		byte[] m=new byte[3];
		byte[][] m1=new byte[3][6];
		
//		int[] h=new int[0];
//		h[0]=10;
//		System.out.println(h[0]);
		
		short b=10;
		int[] x10=new int[b];
		x10[0]='a';
		System.out.println(x10.length);
		
		int[] ch= {'a','b','c'};
		int[] x=ch;
		
		for(int i=0;i<3;i++) {
			System.out.println(x[i]);
			
			
		}
		
		int[] a= {10,20,30,40,50};
		int[] l= {60,70};
		l=a;
		for(int i:l) {
			System.out.println(i);
		}
		
		

	}

}
