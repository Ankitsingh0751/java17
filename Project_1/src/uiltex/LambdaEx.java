package uiltex;

// Lambda Expression


//without lambda expression
/*
interface inter1
{
	void disp();
}
public class LambdaEx{
	
	public static void main(String[]args) {
		int num = 10;
		
		inter1 in = new inter1() { //providing the implementation under the object in only. thats how it will work,
			public void disp()
			{
				System.out.println("hello");
			}
		};
		in.disp();
	}
}

*/

@FunctionalInterface
interface inter1
{
	void disp(int a , int b);
	//void disp();
}
public class LambdaEx{
	
	public static void main(String[]args) {
		int num = 10;
		
		inter1 in =(a,b)->  //same as anonymous inner class, can put parameter or can just put it like this without parameters.
		{
			System.out.println("hello world"+(a+b));
			//return a+b;
		};
		in.disp(3,4);
		//System.out.println(in.disp(3, 4));
	}
}

//Functional interface, the interface which contains only one interface method.
