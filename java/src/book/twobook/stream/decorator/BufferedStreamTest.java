package book.twobook.stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long millisecond = 0;
		FileInputStream fis;  
		FileOutputStream fos;
		
		try {
			fis = new FileInputStream("test.txt");
			fos = new FileOutputStream("name2.txt");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			millisecond = System.currentTimeMillis();
			int i;
			while ((i= bis.read()) != -1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
			
			bos.close();
			bis.close();
			fos.close();
			fis.close();
		} catch (IOException e) {
			
		}
		System.out.println("시간 : "+ millisecond);
		
	}
	
}
