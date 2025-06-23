package com.lti.arraysex;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		


		//Array Methods 
		/*	The Arrays is a utility class which can be found in the java.util package.
		 *  Here are some noteworthy methods it provides:

		asList(): returns a fixed-size list backed by an array.
		binarySearch(): searches for a specific value in an array. Returns the index of the element if found, or -1 if not found. Note that the array must be sorted first.
		copyOf(): copies a portion of the specified array to a new one.
		copyOfRange(): copies a specified range of an array to a new one.
		equals(): compares two arrays to determine if they are equal or not.
		fill(): fills same values to all or some elements in an array.
		sort(): sorts an array into ascending order.
	*/
		
		
		int[] a = {5, 2, 4, 3, 1};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 8);
        System.out.println(Arrays.toString(a));

        int[] b = Arrays.copyOf(a, 5);

        if (Arrays.equals(a, b)) {

            System.out.println("Arrays a, b are equal");
        } else {

            System.out.println("Arrays a, b are not equal");
        }

	}

}
