package com.lti.demos;


//Generics is not restricted to the predefined classes in the Java API's. 
public class Hello<T> { // Integer
	T t; // Integer t

	public Hello(T t) { // Hello(Integer t)
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {

		System.out.print(new Hello<String>("hi"));
		System.out.println(new Hello<Integer>(100));

		Hello h = new Hello("Welcome");
		System.out.println(h.t);

		Hello<String> h1 = new Hello<>("Welcome");
		System.out.println(h1.t);

		Hello<Integer> h2 = new Hello<>(100); //
		System.out.println(h2.t);

		Hello<Number> h3 = new Hello<>(100); //
		System.out.println(h3.t);
	}
}
