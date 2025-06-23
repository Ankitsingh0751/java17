package com.lti.collectionex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
	
		List<Object> myList= new ArrayList<>();
		myList.add(1000.00);
		myList.add("Jayant");
		myList.add(Boolean.TRUE); 
		myList.add(null);
		myList.add(true);
		myList.add(0);
		myList.add(100);
		
	
		
		for(Object i:myList) {
			System.out.println(i);
			
		}
		int prinInt=Integer.parseInt("123");
		Integer objInt=Integer.valueOf("123");
		float f1=Float.valueOf(22);
		float f2=Float.valueOf("22");
		
		System.out.println("----------------------");

		List<Object> myLists= new ArrayList<>();
		myLists.add(100);
		myLists.add(200);
		myLists.add(3); 
		myLists.add(200);
		myLists.add(400);
		System.out.println("here");
		System.out.println(myLists.add("hawk"));
		System.out.println(myLists.remove("hawk"));
		
//		myLists.remove(new Integer(200));
//		
//		for(Object i:myLists) {
//			System.out.println(i);
//			myLists.remove(i);
//			
//		}
		System.out.println(myLists);
		
		System.out.println(myLists.indexOf(200));
		System.out.println(myLists.get(myLists.indexOf(400)));
		
		System.out.println("-----------------");
		List<Integer> list=Arrays.asList(9,7,5,3);
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, 3));
		System.out.println(Collections.binarySearch(list, 6));
		
		System.out.println("----------------------------");
		int[] numbers= {6,9,1,8};
		Arrays.parallelSort(numbers);
		System.out.println(Arrays.binarySearch(numbers,6));
		System.out.println(Arrays.binarySearch(numbers,0));
		
		System.out.println("----------------------------");
		String[] array2= {"gerbil","mouse","cat"};
		List<String> l2=Arrays.asList(array2);
		System.out.println(l2);
		l2.set(1, "test");
		array2[0]="new";
		System.out.println(array2);
		System.out.println(l2);
		for(Object i:array2) {
			System.out.println(i);
		}
//			myLists.remove(i);
//		}	
//		}
//		l2.add("mice");
		
		
		System.out.println("----------------------------");
		String[] array=new String[] {"a","b","c"};
		List<String> asList=Arrays.asList(array);
		List<String> of=List.of(array);
		List<String> copy=List.copyOf(asList);
		
		array[0]="z";
		
		System.out.println(asList);
		System.out.println(of);
		System.out.println(copy);
		
		

	}

}

