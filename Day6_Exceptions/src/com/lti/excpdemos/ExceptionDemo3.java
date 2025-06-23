package com.lti.excpdemos;

public class ExceptionDemo3
{
	public static void main(String args[ ]) 
	{
		int arr[] = {10,5};
		int a = 5;
	
		try
		{      
			arr[0]=100;
			int b = arr[0]/10;
		}		
		//multiple catch // Multi catch is for exceptions with different hierarchy
		//check image  
		catch(  ArithmeticException |IllegalArgumentException |ArrayIndexOutOfBoundsException e)   
		
		//catch(  ArithmeticException | NumberFormatException |ArrayIndexOutOfBoundsException e)   
		{       
			System.out.println("\n enhancement ..multiple expceptions in single catch block ");
			System.out.println("\n Error ....."+e);			
		}
		
		System.out.println("\n After try/catch block....");
		
		
		int x = 2;
		if(x==2)
		x = x*2;
		System.out.println("2nd line");
		if(x==4)
		System.out.println("x:"+x);
		
		
		
		
	}
}
//ArrayStore - if u r trying to  store the wrong type of object into an array of objects 
//Object[] ary = new Integer[4];
