package book.twobook.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:/Users/fnf/Desktop/test2.txt");
			int i;
			while((i= fis.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {
				fis.close();
				
			} catch (Exception e2) {
				
			}
		}
		System.out.println("--end--");
	}
}
