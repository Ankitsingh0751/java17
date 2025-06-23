package com.lti.funintef;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

//BiConsumer is a pre-defined interface
//has two parameters
//and no return type

public class TestBiConsumerEx {

	public static void main(String[] args) {


		
		
		BiConsumer<Double,Double> rectangle=(length,breadth)->
		{
			double area=length*breadth;
			double perimeter=2*(length+breadth);
			System.out.println("Rectangle Details:");
			System.out.println("Area: "+area);
			System.out.println("Perimeter: "+perimeter);
			
			
		};
		rectangle.accept(12d, 6d);

	}

}
