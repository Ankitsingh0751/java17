package com.lti.basics1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VareEx2 {
	

	//local Variable type inference?  LVTI  

	//https://www.infoq.com/articles/java-local-variable-type-inference/
	static {
			var x = "Hi there"; // allowed in static block
			System.out.println(x);
			//static int y="Hi there"; // static not allowed
			// final var y="Hi there"; // final is allowed
		}

		public static void main(String[] args) {

			// x="hello"; x is local to static block

			// Java 5,
			// rather than providing explicit type witnesses:
			// List<String> list = Collection.<String>emptyList();
			// List<String> list1 = Collection<String> emptyList();

			// Java 7
			List<String> list = new ArrayList<>(); // infer type parameters
			// as a shorthand for the more explicit
			List<String> list1 = new ArrayList<String>();

			// Java 8,introduced lambda expressions,
			// we also introduced the ability to infer the types of the formal parameters of
			// lambda expressions.

			list.forEach(s -> System.out.println(s));
			// as a shorthand for the more explicit

			list.forEach((String s) -> System.out.println(s));

			// java 9
			String message = "Good bye, Java 9";

			// java 10 further extended type inference to the declaration of local
			// variables.

			// Type inference in Java is only local;
			var message1 = "Hello, Java 10"; // final is allowed

			// message=101; u can't change , during compilation its types is String

			// We don't provide the data type of message.
			// Instead, we mark the message as a var, and the compiler infers the type of
			// message from the type of the initializer present on the right-hand side.

			// t this feature is available only for local variables with the initializer.
			// It cannot be used for member variables, method parameters, return types, etc
			// – the initializer is required as without which compiler won't be able to
			// infer the type.

			// This enhancement helps in reducing the boilerplate code; for example:

			Map<Integer, String> map = new HashMap<>();
			// This can now be rewritten as:

			var map1 = new HashMap<Integer, String>();
			// This also helps to focus on the variable name rather than on the variable
			// type.
			// var is not a keyword //var is a reserved type name, just like int.
			// note that there is no runtime overhead in using var nor does it make Java a
			// dynamically typed language.
			// The type of the variable is still inferred at compile time and cannot be
			// changed later.

			// var won't work without the initializer:

	//var n; // error: cannot use 'var' on variable without initializer
	//Nor would it work if initialized with null:

			// var emptyList = null; // error: variable initializer is 'null'
	//It won't work for non-local variables:

			// public var = "hello"; // error: 'var' is not allowed here
			// Lambda expression needs explicit target type, and hence var cannot be used:

			// var p = (String s) -> s.length() > 10; // error: lambda expression needs an
			// explicit target-type
			// Same is the case with the array initializer:

			// var arr = { 1, 2, 3 }; // error: array initializer needs an explicit
			// target-type

			// Guidelines for Using var
			// https://www.baeldung.com/java-10-local-variable-type-inference

			// ex1 :
			// List<Map> data = new ArrayList<>();
			// var data = new ArrayList<>();

			var x = "Hi there";
			System.out.println(x);
			// Noncompliant Code Example
			//MyClass myClass = new MyClass();

			int age = 10; // Type is self-explanatory

			// Compliant Solution
			//var myClass = new MyClass();

			var age1 = 10;

			int[] arr1 = new int[] { 1, 2, 3 };
			for (var x1 : arr1)
				System.out.println(x1 + "\n");

			for (var x2 = 0; x2 < 3; x2++)
				System.out.println(arr1[x2] + "\n");

			// can be used as retrun vlaue

//		        int ret()
//		        {
//		            var x = 1;
//		            return x;
//		        }

			// var x = new A().ret();
			// System.out.println(x);

			// https://www.geeksforgeeks.org/local-variable-type-inference-or-lvti-in-java-10/

		}
	}



