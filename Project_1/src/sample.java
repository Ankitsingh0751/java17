
public class sample {
	private int a;
	
		sample(){
		a = 10;
	}

	
	sample(int x) 
	{
		a = x;
	}
	
	public int getValue()
	{
		return a;
	}
}
	
public class Test{
	public static void main(String[] args) {
		sample s1 = new sample();
		sample s = new sample(5);
		System.out.println(s.getValue());
	}
}