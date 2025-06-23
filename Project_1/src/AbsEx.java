//abstract class

/*
abstract class Abs {
	abstract void print();
	Abs()
	{
		System.out.println("Cos");
	}
	void show()
	{
		System.out.println("Non abstract method");
	}
}

public class AbsEx extends Abs{
	void print()
	{
		System.out.println("From main");
	}
	public static void main(String[] args) {
		Abs ab = new AbsEx();
		AbsEx a = new AbsEx();
	}
}

*/
/*
public class AbsEx implements Inter1{
	public void show()
	{
		System.out.println("From main");
	}
	public static void main(String[] args)
	{
		AbsEx t = new AbsEx();
		t.show();
	}
}

*/
//
/*
public class AbsEx implements Inter1{
	public void show()
	{
		System.out.println("From main");
	}
	public void show1()
	{
		System.out.println("One method of main");
	}
	public static void main(String[] args)
	{
		AbsEx t = new AbsEx();
		t.show();
		t.show1();
	}
}
*/
//
/*
public class AbsEx implements Inter1,Inter2{
	public void show()
	{
		System.out.println("From main");
	}
	public void show1()
	{
		System.out.println("One method of main");
	}
	public void move()
	{
		System.out.println("Moving");
	}
	public static void main(String[] args)
	{
		AbsEx t = new AbsEx();
		t.show();
		t.show1();
		t.move();
	}
}
*/
//

public class AbsEx implements Inter1,Inter2{
	public void show()
	{
		System.out.println("From main");
	}
	public void show1()
	{
		System.out.println("One method of main");
	}
	
	public static void main(String[] args)
	{
		AbsEx t = new AbsEx();
		t.show();
		t.show1();
		t.move();
		Inter1.press();
	}
}