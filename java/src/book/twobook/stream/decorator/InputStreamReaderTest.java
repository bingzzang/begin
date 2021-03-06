package book.twobook.stream.decorator;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"))) {
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
