package book.twobook.collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

import book.twobook.collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않음");
		return false;
	}
	
	public void showAllMember() {
		for(Member mem : hashSet) {
			System.out.println(mem);
		}
		System.out.println();
	}
}
