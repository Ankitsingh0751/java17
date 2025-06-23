package com.lti.demos7.generics;


import java.util.ArrayList;
import java.util.List;

//Animal 

//cat    Dog 
//RedCat

class Animal {}

class Cat extends Animal {}

class RedCat extends Cat {}

class Dog extends Animal {}

//? super T: 
//indicates lower bound meaning, any reference types which are superclass of T are allowed.
//? extends T: 
//indicated upper bound meaning, any reference types which are subclass of T are allowed.

//Animal 

//cat 	Dog 

//redcat 

public class GenericsTester {
												//Cat   catList
												// Animal catList
   public static void addCat(List<? extends  Cat> catList) {	  
	   
	   //add method   List class 
         
	 // catList.add(new Cat());
	   
      System.out.println("Cat Added");
   }

   public static void main(String[] args) {
      List<Animal> animalList= new ArrayList<Animal>();      
      List<Cat> catList= new ArrayList<Cat>();      
      List<RedCat> redCatList= new ArrayList<RedCat>();      
      List<Dog> dogList= new ArrayList<Dog>();    
      
      //add list of super class Animal of Cat class
      
        //addCat(animalList);
      //add list of Cat class
        addCat(catList);

      //compile time error
      //can not add list of subclass RedCat of Cat class
  addCat(redCatList);

      //compile time error
      //can not add list of subclass Dog of Superclass Animal of Cat class
  //addCat.addMethod(dogList); 
   }
}