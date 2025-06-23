package Dumppac;

public interface ExampleInterface {
	int one =1;
	static int two = 2;
	static final int three = 3;
	
}

class ExampleClass implements ExampleInterface{
	public static void main(String[] args) {
		ExampleInterface theInstance = new ExampleClass();
		//int f = ExampleInterface.three;
		int e = ExampleInterface.two++;
		//int b = two;
		//int g = theInstance.one;
		//int d = ExampleInterface.one;
		//int c = three;
		//int h = theInstance.two;
		int i = theInstance.three++;
		int a = one++;
	}
}