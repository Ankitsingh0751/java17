package Streams_Ex;

public class StrBldr_32 {
	static StringBuilder sb1 = new StringBuilder("yo ");
	static StringBuilder sb2 = new StringBuilder("hi ");
	
	public static void main( String[] args) {
		sb1 = sb1.append(new StrBldr_32().foo(new StringBuilder("hey")));
		System.out.println(sb1);
	}
	
	StringBuilder foo(StringBuilder s) {
		sb2 = sb2.append(s + "oh ");
		return sb2;
	}
}
