package com.lti.user;

/*
1.Casting an object from a subclass to a superclass doesn’t require an explicit cast.
2. Casting an object from a superclass to a subclass requires an explicit cast.
3. The compiler will not allow casts to unrelated types.
4. Even when the code compiles without issue, an exception may be thrown at runtime if 
the object being cast is not actually an instance of that class.*/

class Parent 
{
	int property = 999999;
	
	int sal=10000;
	
	void shopping() 
	{
		System.out.println("parent card money :" + property +"sal " +sal);
	}
}

class Child extends Parent 
{
	int sal = 100000;
	
	void shopping() 
	{
		System.out.println("shopping via sal :" + sal + " via property also " + property);
	}
}

public class ParentChild {

	public static void main(String[] args) {	
		//p is upcasted reference
		Parent p=new Child();
		p.shopping();//upcasting //implicitly
		
		//Child c=new Parent(); //down casting not allowed
	
//		Child c=(Child)new Parent(); //compilation time error resolved, but will get runtime error
//		c.shopping();
		
		Child c=(Child) p;
		c.shopping();
	}
}
