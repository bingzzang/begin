package book.twobook.collection.treeSet;

import java.util.Comparator;

public class CompareEx implements Comparator<String> {
 
	@Override
	public int compare(String o1, String o2) {
		return (o1.compareTo(o2)) * -1;	//내림차순
	}
	
}
