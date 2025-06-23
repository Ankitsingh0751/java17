package Streams_Ex;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		var list = new ArrayList(
		            List.of("Coffee","Cappucino","Latte"));
		            
		list.forEach((item) -> {
		    list.remove(item);
		});
		System.out.println(list);	}
}
