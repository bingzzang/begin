package book.twobook.collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{

	private int memberId;		//회원 아이디
	private String memberName;	//회원 이름
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;		//멤버아이디를 반환하도록 재정의
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 mem = (Member2)obj;
			if(this.memberId == mem.memberId)
				return true;
			else 
				return false;
		}
		
		return false;
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 "+ memberId + "입니다";
	}
	
	@Override
	public int compare(Member2 o1, Member2 o2) {
		return o1.getMemberId() - o2.memberId;
	}
}
