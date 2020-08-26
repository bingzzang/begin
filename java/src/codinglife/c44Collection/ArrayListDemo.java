package codinglife.c44Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		
		// arrayObj[2] = "three"; 오류 발생
		
		for(int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		System.out.println("-------------");
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
