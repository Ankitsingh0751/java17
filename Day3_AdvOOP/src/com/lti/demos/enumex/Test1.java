package com.lti.demos.enumex;

class Bird{
	public void fly() {
		System.out.print("Fly.");
	}
}

class Peacock extends Bird {
	
	void dance() { 
		System.out.print ("Dance.");
	}
}



/*insert code snippet here*/



public class Test1{
	public static void main(String[] args) { 
		
		Bird b=new Peacock();
		Peacock p=(Peacock)b;
		p.fly();

		p.dance();

	}	
}
