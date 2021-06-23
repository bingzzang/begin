package book.twobook.collection.hashSet;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("박달곰"));
		hashSet.add(new String("류도롱"));
		hashSet.add(new String("허참새"));
		hashSet.add(new String("김호랭"));
		hashSet.add(new String("도동개"));
		hashSet.add(new String("마우수"));
		hashSet.add(new String("허참새"));
		
		System.out.println(hashSet);
	}
}
