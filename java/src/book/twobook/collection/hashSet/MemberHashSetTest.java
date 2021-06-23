package book.twobook.collection.hashSet;

import book.twobook.collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet mem = new MemberHashSet();
		
		Member mem1 = new Member(1001, "허참새");
		Member mem2 = new Member(1002, "김호랭");
		Member mem3 = new Member(1003, "마우수");
		
		mem.addMember(mem1);
		mem.addMember(mem2);
		mem.addMember(mem3);
		mem.showAllMember();
		
		Member mem4 = new Member(1003, "박달곰");
		mem.addMember(mem4);
		mem.showAllMember();
	}
}
