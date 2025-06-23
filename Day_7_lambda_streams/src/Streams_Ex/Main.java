package Streams_Ex;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
	public static void main(String[] args)throws IOException {
		final Reader reader = new FileReader("File.txt");
		try(reader){
			reader.read(); //line1
		} finally {
			reader.read();  //line2
		}
		reader.read();
	}
}
