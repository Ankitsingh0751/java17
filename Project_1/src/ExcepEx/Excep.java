package ExcepEx;

public class Excep {
	public static void main(String[] args) {
		int a = 10;
		int b = 7; //try b=2,b=0
		int c[] = new int[5];  //try7,5
		try {
		System.out.println(a/b);
		System.out.println(c[7]); //try 2,7
		System.out.println("Inside try");
		}
		catch(ArrayIndexOutOfBoundsException   	| ArithmeticException ae) //jdk1.7
		{
			System.out.println(ae);
			
			
		}
//		catch(ArrayIndexOutOfBoundsException ae)
//		{
//			System.out.println(ae);
			
			
//		}
		
//		finally
//		{
//			System.out.println("Finally Executed");
//		}
		System.out.println("After Execution");
	}
}


/*

throwable
Exception error
CHecked, unchecked

try
catch
finally
throws
*/