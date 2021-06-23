package book.twobook.collection.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new CompareEx());
		
		set.add("aaa");
		set.add("ddd");
		set.add("ccc");
		
		System.out.println(set);
	}
}
