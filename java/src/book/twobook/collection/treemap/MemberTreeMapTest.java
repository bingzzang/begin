package book.twobook.collection.treemap;

import book.twobook.collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap member = new MemberTreeMap();
		
		Member mem1 = new Member(1001, "서무디");
		Member mem2 = new Member(1002, "진국희");
		Member mem3 = new Member(1003, "도난수");
		Member mem4 = new Member(1004, "강후루");
		
		member.addMember(mem1);
		member.addMember(mem2);
		member.addMember(mem3);
		member.addMember(mem4);
		
		member.showAllMember();
		
		member.removeMember(1004);
		member.showAllMember();
	}
}
