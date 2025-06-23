package Streams_Ex;

public class Foo {
	private void print() {
		System.out.println("Bonjour le monde!");
	}
	public void foo() {
		print();
	}
}

class Bar extends Foo{
	private void print() {
		System.out.println("Hello world!");
	}
	public void bar() {
		print();
	}
	public static void main(String... args) {
		Bar b = new Bar();
		b.foo();
		b.bar();
	}
}
