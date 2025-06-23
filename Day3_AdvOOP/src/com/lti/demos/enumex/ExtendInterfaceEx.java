package com.lti.demos.enumex;




//https://www.scientecheasy.com/2019/05/interface-in-java.html/

//1. We can define all the constants into one interface and methods in another interface.
//We can use constants in classes where methods are not required.
interface A 
{ 
int x = 10; 
int y = 20; 
} 
interface B extends A 
{ 
void show(); 
}

//An interface cannot extend classes because it would violate rules that an interface can have only abstract methods and constants.
//2. We can also extend various interfaces together by a single interface. 
////An interface can extend Interface1, Interface2.
/*
interface A 
{ 
int x = 20; 
int y = 30; 
} 
interface B extends A 
{ 
void show(); 
} 
interface C extends A, B 
{ 

}
*/

public class ExtendInterfaceEx {
	public static void main(String[] args) {
		
	}

}
