package Dumppac;

public class Test1 {
	private final int x =1;
	static final int y = 0;
	public Test1() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		new Test1();
	}
}
