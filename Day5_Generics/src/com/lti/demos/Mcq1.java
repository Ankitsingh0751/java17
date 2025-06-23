package com.lti.demos;


import java.util.ArrayList;
import java.util.List;
//Animal 
//	|
//Cat      Dog 
 //  |
//RedCat 
class Animal {
}
class Cat extends Animal {
}
class RedCat extends Cat {
}
class Dog extends Animal {
}


class Fly{}

class Bird extends Fly {}

class Sparrow extends Bird {}

class SmallB extends Sparrow{} 





public class Mcq1 {

	public static void addCat(List<? extends Cat> catList) { // line 1  // read only // aceept subtypes //upper bound 
		//catList.add(new Cat()); // line 2
		System.out.println("Cat Added");
	}

	public static void main(String[] args) {

		List<Animal> animalList = new ArrayList<Animal>();
		List<Cat> catList = new ArrayList<Cat>();
		List<RedCat> redCatList = new ArrayList<RedCat>();
		List<Dog> dogList = new ArrayList<Dog>();
		
		//addCat(animalList); // line 3
		addCat(catList); // line 4
		addCat(redCatList); // line 5
		//addCat(dogList);
		
		List<? super Bird> birds = new ArrayList<Bird>();

		birds.add(new Sparrow());


		birds.add(new SmallB());
	}

}
