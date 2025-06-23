/*
public interface Inter1 {
	int x = 5; //all  values are final since we are initializes it with values
	void show(); //all methods are public, abstract
}

//by default all the methods in interface are public, final, static
*/
public interface Inter1 extends Inter2{
	int x = 5; //all  values are final since we are initializes it with values
	void show(); //all methods are public, abstract
	static void press() //jdk 1.7
	{
		System.out.println("Calling from inter1");
	}
}

//default and static methods can have implementation in interface

//marker interface