package com.lti.excpdemos;

// 1 throws exception
// 2 some Java error message
// 3 pgm terminates

// Types: Checked and Unchecked
// Unchecked : during compilation exception is not checked // runtime

/* Program to demonstrates try and catch block */

//can have multiple catch blocks 
//super class exceptions - has to be handled at the end ( last catch) 
//if no hierarchy - any sequence catch blocks 


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Demo1 {
	public static void main(String args[]) {
		int k=100;
		try {
			int x=10;
			int y=0;
			int result=x/y;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Plz check value of y might be zero!");
		}
		int x = 15, y = 5, a = 5, z;
		
		int arr[] = { 10, 5 };
		
		try {
			int b = arr[2] /0;
			z = 500 / 10; 
			System.out.println("z:" + z);
			// System.out.println(" This will not be Executed if error occurs");
		} catch (ArithmeticException e) {
			System.out.println("\n please check there is zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\n Array index going out of bound ....");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("You are in finally block");
		}
		System.out.println("\n After catch block....");

		// super class exp should come at last catch block
//Ex 2 
		/*try {
			File file = new File("ABC.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));

			String st;
			while ((st = br.readLine()) != null)
				System.out.println(st);
		} 
		
		catch (FileNotFoundException ex) { // sub class 
			ex.printStackTrace();
		} 
		catch (IOException ex) {  // super class 
			ex.printStackTrace();
		}*/
		// If the exceptions are not in the same inheritance tree,
		// i.e. they don’t have parent-child relationship, the catch blocks can be
		// sorted any order.

		try {
			// some code here
		} catch (NumberFormatException ex) {
			System.out.println("Number Format Exception " + ex);
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic " + ex);
		}

	}
}
