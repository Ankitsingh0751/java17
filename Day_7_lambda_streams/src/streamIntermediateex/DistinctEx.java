package streamIntermediateex;

import java.util.stream.Stream;

public class DistinctEx {
	public static void main(String[] args) {
		Stream<String> myStream = Stream.of("Tom","Spike","Jerry");
		
		myStream
				.distinct()
				.forEach(s->System.out.println(s));
		
		//filter
		Stream<String> myStream1 = Stream.of("Tom","Spike","Jerry");
		
		myStream1
				.filter(x -> x.startsWith("J"))
				.forEach(System.out::println);
		
		//concat
		Stream<String> myStream2 = Stream.of("Tom","Spike","Jerry");
		
		myStream2	
					.map(x -> x.concat("Hello"))
					.forEach(s -> System.out.println(s));	
				
		
		Stream<String> myStream3 = Stream.of("Tom","Spike","Jerry");
		
		myStream3	
					.map(x -> x.length())
					.forEach(s -> System.out.println(s));	
		
		
		//peek //usefull for debugging or testing
		System.out.println("------------");
		
		Stream<String> myStream4 = Stream.of("Tom","Spike","Jerry");
		
		long count = myStream4
								.filter(s ->s.startsWith("J"))
								.peek(s -> System.out.println(s))
								.count();
		
			System.out.println(count);
			
			
		// sort
			
		
			
			
	}

}
