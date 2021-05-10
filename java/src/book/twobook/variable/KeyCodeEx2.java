package book.twobook.variable;

import java.io.IOException;

public class KeyCodeEx2 {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keycode : " +keyCode );
			
			if(keyCode == 113) break;
		}
	}
}
