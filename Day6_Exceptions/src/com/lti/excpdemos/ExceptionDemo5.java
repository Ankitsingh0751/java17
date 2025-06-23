package com.lti.excpdemos;

class ExceptionDemo5
{
	public static void main(String args[]) 
	{
		try
		{
			int x = 2;			
			int y = 500/10;			

						try
						{   
					    if (x==2) 
					    	x = x/(x-x);   
					 	    if(x==2)
							    {
				                int arr[]={5,20,25};
								arr[2]= 100;  
							    }
		                }						
		               catch(ArrayIndexOutOfBoundsException e)   
				       {       
					     System.out.println("\n Array index out of Bounds...."+e);	
				       }
		  }
 		  catch(NullPointerException e)   
		  {       
		        System.out.println("\n Division by zero....."+e);	
		  }
		System.out.println(" hello Jagdeesan");
	}
}
