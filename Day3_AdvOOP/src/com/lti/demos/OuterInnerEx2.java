package com.lti.demos;



class OuterClass2{
	static int x=10;
	int y=6;
	void m() {
		System.out.println("Outer class method X: "+x);
		System.out.println("Outer class method cannot access i: ");
		System.out.println(" Value of y accessed from outer block: "+y);
	}
	
	static class InnerClass{
		//static block cannot access non static entity
		int i=100;
		void m1() {
			//System.out.println("----------------------------------");
			System.out.println(" inner class "+i);
			System.out.println("Inner class method can access static x: "+x);
//			System.out.println(" y through static inner block"+y);//Cannot make a static reference to the non-static field y
		}
	}
}

public class OuterInnerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass2.InnerClass obj2= new OuterClass2.InnerClass();
		obj2.m1();

	}

}
