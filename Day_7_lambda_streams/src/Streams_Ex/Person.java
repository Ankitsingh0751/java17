package Streams_Ex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Person {
	public static void main(String[] args) {
		//BiPredicate<String, String> testEquality = ( x, y)  -> (x.equals(y));

		
		//		Integer[] ints = {1,2,3,4,5,6,7};
//		var list = Arrays.asList(ints);
//		UnaryOperator<Integer> uo =  x ->x*3;
//		//UnaryOperator<Integer> uo =  x ->{return  x*3;};
//		list.replaceAll(uo);
		
		
//		StringBuilder s = new StringBuilder("ABCD");
//		s.replace(s.indexOf("B"),s.indexOf("B"), "Q");
		
		
		
//		int i = 3;
//		int j = 25;
//		System.out.println(i>2 ? i>10 ? i* (j+10) : i * j + 5: i);
		
		
//		int i=10;
//		do {
//			for(int j = i/2; j>0; j--) {
//				System.out.println(j + " ");
//			}
//			i-=2;
//		}while(i>10);
		
		
//		Locale locale = Locale.getDefault();
//		Locale locale1 = new Locale("en", "GB");
//		Locale locale2 = "fr_FR";
//		Locale locale3 = "en_USA";
//		Locale[] locale4 = Locale.getAvailableLocales();
		
		
//		String str;
//		private void methodA() {
//			System.out.println("methodA");
//		}
		
		
		int number =20;
		Predicate<Integer> p = a -> a%2 !=0;
		if(p.test(number)) {
			System.out.println(number + " is odd.");
		} else {
			System.out.println(number + " is even.");
		}
		
	}
}
