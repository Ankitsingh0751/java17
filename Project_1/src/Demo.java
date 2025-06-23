
public class Demo {
	// salary  variable is a private static variable
	   private static double salary;

	   // DEPARTMENT is a constant
	   public static final String DEPARTMENT = "Development ";

	   public static void main(String args[]) {
	      salary = 1000;
	      System.out.println(DEPARTMENT + "average salary:" + salary);
	   }
}

/*
public class Demo{
	//static int a = 0;
	int a = 0;
	
	Test()
	{
		System.out.println(++a);
	}
	public static void main(String[] args) {
		Test s;
		for(int i =0;i<3;i++) {
			s = new Test();
		}
	}
}
*/