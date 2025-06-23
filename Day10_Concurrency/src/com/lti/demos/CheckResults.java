package com.lti.demos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResults {

	private static int counter=0;
	public static void main(String[] args) throws Exception{
		ExecutorService service=null;
		try {
			service=Executors.newSingleThreadExecutor();
			Future<?> result=service.submit(()->{
				for(int i=0;i<500;i++)
					CheckResults.counter++;
			});
			result.get(10,TimeUnit.SECONDS); // return type of .get() will be null as runnable.run() has void return type
			System.out.println("Reached!");
		}catch(TimeoutException e) {
			System.out.println("Not Reached in Time");
		}finally {
			if(service!=null)service.shutdown();
		}

	}

}
