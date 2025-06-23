package Dumppac;

public class Main1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		Thread t3 = new Thread(new MyThread());
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.start();
	}
}

class MyThread implements Runnable{
	public void run() {
		System.out.println("Running.");
	}
}
