package com.lti.demos;

class PrintData implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<8;i++) {
			System.out.println("Printing Records "+ i);
			
		}
		
	}
	
}

class ReadInventoryThread extends Thread{
	@Override
	public void run() {
			System.out.println("Printing Zoo Inventory");
			
		}
		
	
}

public class Demo1Runnable {

	public static void main(String[] args) {
		
		//The order of thread execution is unknown until runtime
		System.out.println("begin");
		System.out.println("--------------------");
		/*These threads are executed in asynchronous tasks- i.e. thread executing main() 
		 * does not wait for the results of each newly created thread before executing*/
		(new ReadInventoryThread()).start();
		System.out.println("--------------------");
		(new Thread(new PrintData())).start();
		System.out.println("--------------------");
		(new ReadInventoryThread()).start();
		System.out.println("End");
		
		
		//When using run() order of thread execution will remain same at all time
		System.out.println("begin");
		System.out.println("--------------------");
		/*Calling run() on a Thread or a Runnable does not actually start a new thread.
		 * while the code will compile none will actually execute a task on a separate thread*/
		(new ReadInventoryThread()).run();
		System.out.println("--------------------");
		(new Thread(new PrintData())).run();
		System.out.println("--------------------");
		(new ReadInventoryThread()).run();
		System.out.println("End");

	}

}
