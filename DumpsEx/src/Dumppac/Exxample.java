package Dumppac;

public final class X {
	

	public static X createX(double amount) {
		return new X(amount);
		
	}
	public X(double amount);
	private X(double amount) {
		this.amount = amount;
	}
	public String toString() {
		return String.ValueOf(amount);
		
		
	}
	
}

public final class Main() {
	public static void main(String[] args) {
		Exxample x = Exxample.createExxample(100.0);
		x.amount = 500.0;
		System.out.println(x);
	}
}
