package codinglife.c44Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	
	public static void main(String[] args) {
		List<Computer> com = new ArrayList<Computer>();
		
		com.add(new Computer(500, "dalgom"));
		com.add(new Computer(200, "rumi"));
		com.add(new Computer(3233, "chamsae"));
		
		
		Iterator i = com.iterator();
		System.out.println("before");
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collections.sort(com);
		System.out.println("\nafter");
		i=com.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
