package book.twobook.stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("알파벳 하나 입력");
		
		int i;
		
		try {
			i = System.in.read();	// 1바이트만 읽어 들임
			System.out.println(i);
			System.out.println((char)i);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
