package basic.ex.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Hello");
		list.add(new Integer(183));
		list.add(new MyStudent());
		list.add(new Float(4.56F));
		list.add("Hello");
		list.add(new Integer(183));
		
		
//		String name = list.get(0); Object로 저장되기 때문에 형변환 해주어야 함
		String name = (String)list.get(0);
		Integer i1 = (Integer)list.get(1);
		MyStudent s = (MyStudent)list.get(2);
		
		System.out.println(name);
		System.out.println(i1);
		System.out.println(s);
		System.out.println();
		
		list.remove(2);
		
		for(int i = 0 ; i <list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list);
		

	}

}
