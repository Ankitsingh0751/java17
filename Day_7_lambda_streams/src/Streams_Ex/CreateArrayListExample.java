package Streams_Ex;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class CreateArrayListExample {
	public static void main(String[] args) {
		List vegetables = new ArrayList<>();
		    vegetables.add("Kale");
		    vegetables.add(0,"Lettuce");
		    System.out.println(vegetables);
		            
	    List fish = new ArrayList<>();
		    fish.add("salmon");
		    fish.add(0,"Seabass");
		    System.out.println(fish);
	}
}
