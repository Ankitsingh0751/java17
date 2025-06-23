package Dumppac;

import java.util.Arrays;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		var persons = Arrays.asList(new Person("Max",18),
									new Person("Peter",23),
									new Person("Pamela",23),
									new Person("David",12));
		
		int num = persons.stream()
							.mapToInt(Person::getAge)
							.filter(p -> p<20)
							.reduce(0, (a,b) -> a+b);
		
		System.out.println(num);
	}
}
