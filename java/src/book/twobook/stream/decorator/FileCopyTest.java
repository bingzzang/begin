package book.twobook.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long millisecond = 0;
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			FileOutputStream fos = new FileOutputStream("name.txt");
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i = fis.read())!= -1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("시간 : "+millisecond);
	}
}
