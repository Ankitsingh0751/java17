
public class Calculator {
	public int fact(int a) {
		int f =1;
		for(int i =1;i<=a;i++) {
			f = f*1;
			
		}
		return f;
	}


public static void main(String[] args)
{
	Calculator c = new Calculator();
	System.out.println(c.fact(5));
}
}