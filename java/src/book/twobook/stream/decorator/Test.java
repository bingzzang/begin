package book.twobook.stream.decorator;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>(); 
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"))) {
			int i;
			while((i = isr.read()) != -1) {
				list.add((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		for(int i=0; i<list.size();i++) {
//			System.out.print(list.get(i));
//		}
//		
		System.out.println(list.get(3));
	}
}
