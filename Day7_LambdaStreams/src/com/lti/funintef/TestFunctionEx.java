package com.lti.funintef;
/*One parameter and also a return type
 * has a method accept
 * */
import java.util.function.Function;

public class TestFunctionEx {

	public static void main(String[] args) {
		 //Wrapper class need to be used not primitive data type
		Function<Integer,Double> f1=x->x*10.25;
		double d=f1.apply(100);
		System.out.println(d);
		
		System.out.println("--------------------");
		
		Function<String,Integer> f=s->s.length();
		System.out.println(f.apply("cluck"));
		
		System.out.println("-------------------");
		
		Function<String,Boolean> f3=x->x.startsWith("fdf");
		System.out.println(f3.apply("cluck"));//false
		
		System.out.println("-------------------");
		
		Function<Double,Double> before=x->x+1.0;
		Function<Double,Double> after=x->x*2.0;

		Function<Double,Double>  combined=after.compose(before);
		System.out.println(combined.apply(3.0));
		

	}

}
