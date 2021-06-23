package book.twobook.collection.treeSet;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("서무디");
		treeSet.add("도난수");
		treeSet.add("진국희");
		
		for(String str:treeSet) {
			System.out.println(str);
		}
	}
}
