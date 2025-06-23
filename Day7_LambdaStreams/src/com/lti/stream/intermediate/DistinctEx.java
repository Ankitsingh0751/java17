package com.lti.stream.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Distinct use for finding Unique values
public class DistinctEx {

	public static void main(String[] args) {
		
		Stream<String> myStream=Stream.of("Tom","Jerry","Spike","Jerry");
		
		myStream
			.distinct()
			.forEach(s->System.out.println(s));//Intermediate then terminating operations

		//filter
		
		Stream<String> myStream1=Stream.of("Tom","Jerry","Spike","Jerry");
		myStream1
				.filter(str->str.startsWith("J"))
				.forEach(System.out::println);
		
		// If we try to operate stream again then we get exception
		//Concat
		Stream<String> myStream2=Stream.of("Tom","Jerry","Spike","Jerry");
	
		myStream2
		.map(x->x.concat("Hello"))
		.forEach(s->System.out.println(s));
		
		
		Stream<String> myStream3=Stream.of("Tom","Jerry","Spike","Jerry");
		
		myStream3
		.map(x->x.length())
		.forEach(s->System.out.println(s));
		
		//peek //useful for debugging or testing
		Stream<String> myStream4=Stream.of("Tom","Jerry","Spike","Jerry");
		
	
	}

}
