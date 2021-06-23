package book.twobook.collection.treeSet;

import book.twobook.collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet member = new MemberTreeSet();
		
		Member mem1 = new Member(1001, "서무디");
		Member mem2 = new Member(1002, "진국희");
		Member mem3 = new Member(1003, "도난수");
		
		member.addMember(mem1);
		member.addMember(mem2);
		member.addMember(mem3);
		member.showAllMember();
		
		Member mem4 = new Member(1003, "강후루");
		member.addMember(mem4);
		member.showAllMember();
	}
}
