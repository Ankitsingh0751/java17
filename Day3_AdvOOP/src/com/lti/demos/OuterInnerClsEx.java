package com.lti.demos;

//Inner is a member inner class.
//Inner classes are not allowed to contain static methods or static variables.
//Only nested static classes are permitted to contain static varibales .

class OuterClass{
	int x=10;
	private int y=5;
	void m() {
		System.out.println("Outer class method X: "+x);
		System.out.println("Outer class y "+y);
		System.out.println("Outer class method cannot access i: ");
		//System.out.println(" Private j in outer "+j);
	}
	
	class InnerClass{
		int i=100;
		private int j=2;
		void m1() {
			System.out.println("----------------------------------");
			System.out.println(" inner class "+i);
			System.out.println(" y in inner class "+y);
			System.out.println(" private j inside inner class" +j);
			System.out.println("Inner class method can access x: "+x);
		}
	}
}


public class OuterInnerClsEx {
	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		obj.m();
		OuterClass.InnerClass obj2=obj.new InnerClass();
		obj2.m1();
		
		
	}

}
