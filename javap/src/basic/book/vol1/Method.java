package basic.book.vol1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str;
	
	void main() throws IOException{
			str = br.readLine();
			show();
			reply();
	}
	
	void show() {
		System.out.println(str);
	}
	
	void reply() throws IOException {
		System.out.println("Re?(Y/N)");
		str = br.readLine();
		
		if("Y".equalsIgnoreCase(str)) {
			main();
		}else {
			System.out.println("END");
		}
		
	}
	public static void main(String args[]) throws IOException{
		Method m = new Method();
		m.main();
	}
	
}
