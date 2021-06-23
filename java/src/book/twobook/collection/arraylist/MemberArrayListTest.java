package book.twobook.collection.arraylist;

import book.twobook.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이곡길");
		Member memberKim = new Member(1002, "김복수");
		Member memberNa = new Member(1003, "나왕눈");
		Member memberPark = new Member(1004, "박람지");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberNa);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberNa.getMemberId());
		memberArrayList.showAllMember();
		
		memberArrayList.addMember2(2, memberNa);
		memberArrayList.showAllMember();
	}
}
