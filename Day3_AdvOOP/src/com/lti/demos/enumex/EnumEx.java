package com.lti.demos.enumex;

//enum are top level classes in java

//Internally enum's are implemented by using class concept.
//Every enum constant is a reference variable to that enum type object. 
//Every enum constant is implicitly public static final always. 

enum Dir{
	LEFT,RIGHT,UP,DOWN;
}

public class EnumEx {

	public static void main(String[] args) {
		Dir m1=Dir.LEFT;
		switch(m1){
			
		case LEFT:System.out.println("Going Left");
					break;
		case RIGHT:System.out.println("Going Right");
				break;
		
		case UP:System.out.println("Going Up");
				break;
		
		case DOWN:System.out.println("Going Down");
			break;
		
		default:System.out.println("Not in enum");
				break;
		
		
		
		}



	}

}
