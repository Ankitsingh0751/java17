package com.lti.arraysex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySearch {

	public static void main(String[] args) {
		//array Traversing
		
		 String[] planets = { "Mercury", "Venus", "Mars", "Earth", "Jupiter",
		            "Saturn", "Uranus", "Neptune", "Pluto" };

		        for (int i=0; i < planets.length; i++) {

		            System.out.println(planets[i]);
		        }

		        for (String planet : planets) {

		            System.out.println(planet);
		        }
		
		
		//searching element on sorted Java array
		//unsorted	String array 
		
		String[] Names = new String[]{"Vin", "Michelle", "Luke", "Paul"};
		//sorting array in Java 
		Arrays.sort(Names);
		for(int i= 1; i <4; i++)
		{
			System.out.println("Names :" +Names[i]);			
		}		
		//searching on sorted array in Java using Arrays binarySearch() method
		
		if(Arrays.binarySearch(Names, "Paul") >=0 )
		{
		System.out.println("Found Paul");
		}
		
		String[] planets1 = { "Mercury", "Venus", "Mars", "Earth", "Jupiter",
	            "Saturn", "Uranus", "Neptune", "Pluto" };

	        Arrays.sort(planets1);
	     
	        for(int i= 0; i <9; i++)
			{
				System.out.println("planets :" +planets1[i]);			
			}	
	        String p = "Earth";

	        int r = Arrays.binarySearch(planets1, p);
	        System.out.println(" r :"+r);
		
		
		
		//plain old for loop for searching elements in Java array
		String input = "Luke";
		for(String Name: Names)
		{
			if(Name.equals(input)){
				System.out.println("Found Luke");
			}		
		}
		

		
		//search ing element on unsorted Java array
		//searching Java array using ArrayList

		List<Integer> array = new ArrayList<>();
		
		for(int i= 1; i <= 5; i++)
		{
			array.add(i) ;			
		}
		System.out.println(array);

		if (array.contains(3)) {
		System.out.println("Element found inside Java array using Array List contains() method");
		}
		
		   // Convert String Array to List
       List<String> myList = Arrays.asList(Names);
       if (myList.contains("Luke")) {
         System.out.println("Luke Found");
       }
       if (myList.contains("Michelle") || myList.contains("Paul")) {
           System.out.println("Paul and Michelle found");
       }
       // A and B
       if (myList.containsAll(Arrays.asList("Michelle", "Paul"))) {
           System.out.println(" both found");
       }
		
       String[] oneArray= {"123","hawk","9","112","0300","robin"};
       Arrays.parallelSort(oneArray);
       List<String> oneAsList=Arrays.asList(oneArray);
       System.out.println(oneAsList);

	}

}
