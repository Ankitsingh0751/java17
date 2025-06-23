package com.lti.stremsex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WayEx {

	public static void main(String[] args) {
		
		//how to create stream
		//finite stream
		Stream<String> emptyStream=Stream.empty();
		Stream<Integer> intStream=Stream.of(100);
		
		Stream<Integer> intStream2=Stream.of(100,200,3000,4000);
		
		//list to stream
		
		List<String> myList=Arrays.asList("Gyan","Myan");
		Stream<String> myStream=myList.stream();
		
		myStream.forEach(System.out::println);
		
		//infinte Streams
//		Stream<Double> myStream1=Stream.generate(Math::random);
//		
//		myStream1.forEach(System.out::println);
		Stream<Integer> intStream3=Stream.iterate(1,n->n+2).limit(10);
		intStream3.forEach(System.out::println);
		
		

	}

}
