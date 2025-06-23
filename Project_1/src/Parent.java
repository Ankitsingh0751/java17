//Inheritance single
//try multiple inheritance
/*
class PParent {
	int p1 = 20;
	void show()
	{
		System.out.println("From parent : "+p1);
	}
}

class Child extends PParent{
	int c1 = 30;
	void disp()
	{
		System.out.println("From child : "+c1);
		
	}
}

public class Parent{
	public static void main(String[] args) {
		//Parent p = new Parent();
		
		Child c = new Child();
		c.disp();
		c.show();
	}
}
*/
//polymorphism

class PParent {
	int p1 = 20;
	void show()
	{
		System.out.println("From parent : "+p1);
	}
}

class Child extends PParent{
	int c1 = 30;
	void show()
	{
		
		super.show();
		//super();  calling the constructor, can also pass the argument if want.
		//super.p1();
		System.out.println("From child : "+c1);
		
	}
}

public class Parent{
	public static void main(String[] args) {
		//Parent p = new Parent();
		
		Child c = new Child();
		//c.disp();
		c.show();
		
	}
}