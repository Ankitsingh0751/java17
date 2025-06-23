package RecapTest;

import java.util.ArrayList;

class A{
	public void showEmployeeDatalastYear()
	{
		System.out.println("A class method called");
	}
}

class B extends A
{
	@Deprecated
	@Override
	//@SuppressWarnings("unchcked")
	public void showEmployeeDatalastYear()
	{
		System.out.println("B class method called");
		
		ArrayList myList = new ArrayList();
		System.out.println(myList);
	}
}

public class Annotationtest {
	public static void main(String[] args) {
		B objb = new B();
		objb.showEmployeeDatalastYear();
	}

}
