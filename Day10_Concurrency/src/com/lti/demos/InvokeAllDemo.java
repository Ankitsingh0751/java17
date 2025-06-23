package com.lti.demos;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService service=null;
		service=Executors.newSingleThreadExecutor();
		System.out.println("Begin");
			Callable<String> task=()->"result";
			List<Future<String>> list=service.invokeAll(List.of(task,task,task));
			for(Future<String> future:list) {
				System.out.println(future.get());
			}
			System.out.println("End");

	}

}
