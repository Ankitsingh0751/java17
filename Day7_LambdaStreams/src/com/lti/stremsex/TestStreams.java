package com.lti.stremsex;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreams {
	public static void main(String[] args) {
		List<Person>persons=Arrays.asList(
				new Person("Jay",30),
				new Person("Vijay",20),
				new Person("Sanjay",40)
				);
		Optional<Person>temp=persons.parallelStream().
				filter(p->"Vijay".equals(p.getPerName())).findAny();
		
		System.out.println(temp);
		
		System.out.println("-------------------------------");
		List<String> lines=Arrays.asList("Oracle","Java","DotNet","SQLServer");
		List<String> perList=lines.stream()
				.filter(x->!"DotNet".equals(x)).collect(Collectors.toList());
		System.out.println(perList);
		
	
}

}
