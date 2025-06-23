package streamIntermediateex;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminatingOpns {
	public static void main(String[] args) {
		
		Stream<String> myStream = Stream.of("w","o","i","o","f");
		TreeSet<String> set =  myStream.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set);
		
		
		Stream<String> myStream1 = Stream.of("w","o","i","o","f");
		System.out.println(myStream1.count());
		
		
		System.out.println("-------------");
		//findAny
		
		Stream.of("gorilla","m","bonobo")
				.findAny()
				.ifPresent(System.out::println);
		
		//Stream<String>
		
		//match
		
		List<String> list = Arrays.asList("monkey", "2", "chimp");  //if we write all integer then it will show true.   
        
	           
	       
	       							//"2"
	       Predicate<String> pred = x -> Character.isLetter(x.charAt(0));      
	       
	      
	        System.out.println(list.stream().anyMatch(pred));
	        System.out.println(list.stream().allMatch(pred));
	        System.out.println(list.stream().noneMatch(pred));
	        
	        
	        Stream<String> infinite = Stream.generate(() -> "chimp"); 
	        System.out.println(infinite.anyMatch(pred));
	        
	        //min
	        
	        Stream<String> s = Stream.of("monday", "tue", "bonsd");
	          
	          Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
	          
	          min.ifPresent(System.out::println);
	          
	          //reduce
	          
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
