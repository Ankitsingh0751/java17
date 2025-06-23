package Dumppac;

public class EExample {
	public static void main(String[] args) {
		String s = "Oracle";
		Runnable r = () ->{
			System.out.println(s);
			
		};
		s = "Java";
		Thread t = new Thread(r);
			t.start();
	}
}
