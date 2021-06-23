package book.twobook.collection;

public class Member implements Comparable<Member>{

	private int memberId;		//회원 아이디
	private String memberName;	//회원 이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;		//멤버아이디를 반환하도록 재정의
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member)obj;
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
	public int compareTo(Member o) {	//오름차순이 기본
		return (this.memberId - o.memberId) * (-1);	//내림차순으로 정렬하려면 음수로 만들어야함
//		return memberName.compareTo(o.memberName);	//이름으로 정렬
	}
}
