package com.lti.stream.intermediate;

import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminatingOpns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> myStream=Stream.of("w","o","l","o","f");
		TreeSet<String> set=myStream.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set);
		
		Stream<String> myStream1=Stream.of("w","o","l","o","f");
		System.out.println(myStream1.count());
		
		Stream<String> s = Stream.of("monday", "tue", "bonsd");
        
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        
        min.ifPresent(System.out::println);
        
        Stream<Integer> numbers = Stream.of(3, 5, 6);
		// 3, 5, 6
		// 15 6
			
		System.out.println(numbers.reduce((a, b) -> a * b));
		
		//int sum1 = Stream.of(3, 5, 6).reduce(0,(a, b) -> a * b);
		//System.out.println(sum1);

											// 2 * 3 // 6 * 5 // 30* 6 
		int sum2 = Stream.of(3, 5, 6).reduce(2, (a, b) -> a * b);
		System.out.println(sum2);

		//int sum3 = Stream.of(3, 5, 6).reduce(3, (a, b) -> a * b);
		//System.out.println(sum3);
	}

}
