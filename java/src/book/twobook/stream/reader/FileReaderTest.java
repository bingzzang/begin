package book.twobook.stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("test.txt");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
	}
}
