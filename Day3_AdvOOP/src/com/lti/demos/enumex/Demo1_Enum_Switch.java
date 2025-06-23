package com.lti.demos.enumex;

//An enumeration (enum) is like a fixed set of constants. 

//In Java, an enum, short for "enumerated type", 
//can be a top-level type like a class or interface, 
//as well as a nested type like an inner class.

//Inside enum we can declare main method and even we can invoke enum directly from the command prompt. 

/*
enum Dir1 {
	LEFT, RIGHT, UP, DOWN; // semicolon reqd
	public static void main(String args[]) {
		System.out.println("enum main() method called");
	}}
*/
//Output: D:\Enum>java Dir1   //enum main() method called

//Internally enum's are implemented by using class concept.
//Every enum constant is a reference variable to that enum type object. 
//Every enum constant is implicitly public static final always. 

//in memory :

/*  final class Dir extends java.lang.Enum
{ 
	  public static final Dir LEFT= new Dir(); 
public static final Dir RIGHT= new Dir(); 
public static final Dir UP=
new Dir(); public static final Dir DOWN= new Dir(); }*/

//Enum vs constructor:
//Enum can contain constructor. 
//Every enum constant represents an object of that enum class which is static
//hence all enum constants will be created at the time of class loading automatically 
//and hence constructor will be executed at the time of enum class loading //for every enum constants.

//Tea vending machine -
//Tea Coffe HotWoater Milk  

//User - Menu - 

enum Dir1 {
	LEFT, RIGHT, UP, DOWN // DOWN ; // ; is optional
}

enum Dir2 {
	LEFT, RIGHT, UP, DOWN;
	Dir2() {
		System.out.println("Constructor called.");
	}
}

public class Demo1_Enum_Switch {
	public static void main(String arg[]) {
		
		Dir2 d = Dir2.LEFT; // --> 4 times constructor called
		// We can't create enum object explicitly
	 //Dir2 d= new Dir2(); //enum types may not be instantiated

		// Every enum constant internally static hence we can access by using "enum		// name".
				// Internally inside every enum toString() method is implemented to return name		// of the constant
				// That is from 1.5 version onwards we can use enum type as argument to switch
				// statement // 1.7 onward String was also allowed inside switch
		Dir1 m1 = Dir1.DOWN;
		
		switch(m1)
		{
		case DOWN:
			System.out.println("You are going dwon");
			break;
		}

		

		// using values() and ordinal()
		/*
		 * Every enum implicitly contains a static values() method to list all constants
		 * of enum. Example: Beer[] b=Beer.values();
		 * 
		 * ordinal() method: Within enum the order of constants is important we can
		 * specify by its ordinal value. We can find ordinal value(index value) of enum
		 * constant by using ordinal() method. Example: public final int ordinal();
		 */

		
		switch (m1.ordinal()) // LINE A
		{
		case 0:
			System.out.println("You are going left");
			break;

		case 1:
			System.out.println("You are going right");
			break;

		case 2:
			System.out.println("You are going up");
			break;

		case 3:
			System.out.println("You are going down");
			break;

		// case FRONT: System.out.println( "You are going down" );
		// break;

		default:
			System.out.println("Invalid move");
		}

	
		Dir1[] dirAry = Dir1.values();

	/*	for (Dir d : dirAry)// this is forEach loop.
		{
			System.out.println(d + "......." + d.ordinal());
			// System.out.println(d+"......."+d.ordinal());
		}*/

	
	}
}

//Enum with methods :
/*
enum Beer {
	KF(100), KO(70), RC(65), Fo(90), KALYANI;
	int price;

	Beer(int price) {
		this.price = price;
	}

	Beer() {
		this.price = 125;
	}

	public int getPrice() {
		return price;
	}
}

class Test {
	public static void main(String args[]) {
		Beer[] b = Beer.values();
		for (Beer b1 : b) {
			System.out.println(b1 + "......." + b1.getPrice());
		}
	}
}*/

/*
* Enum vs inheritance: Every enum in java is the direct child class of
* java.lang.Enum class hence it is not possible to extends any other enum.
* Every enum is implicitly final hence we can't create child enum.
* 
* Because of above reasons we can conclude inheritance concept is not
* applicable for enum's explicitly. Hence we can't apply extends keyword for
* enum's . But enum can implement any no. Of interfaces simultaneously
* 
* Every enum in java is the direct child class of java.lang.Enum class. Hence
* this class acts as base class for all java enums. It is abstract class and it
* is direct child class of "Object class" It implements Serializable and
* Comparable.
* 
* 
* 
* 
* 
*/

/*
* Enum vs constructor: Enum can contain constructor. Every enum constant
* represents an object of that enum class which is static hence all enum
* constants will be created at the time of class loading automatically and
* hence constructor will be executed at the time of enum class loading for
* every enum constants.
*/

/*
* enum Vs Enum Vs Enumeration : enum : enum is a keyword which can be used to
* define a group of named constants. Enum : It is a class present in java.lang
* package . Every enum in java is the direct child class of this class. Hence
* this Enum class acts as base class for all java enum's . Enumeration : It is
* a interface present in java.util package . We can use Enumeration to get the
* objects one by one from the Collections.
*/
