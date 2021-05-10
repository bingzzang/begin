package book.twobook.variable;

import java.io.IOException;

public class KeyCodeEx {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+keyCode);
	}
}
