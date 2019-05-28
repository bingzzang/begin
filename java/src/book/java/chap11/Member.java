package book.java.chap11;

public class Member {

	public String id;
	public Member(String id) {
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {			//매개값이 Member 타입인지 확인
			Member mem = (Member) obj;		//Member 타입으로 강제 타입 변환
			if(id.equals(mem.id)) {			//id  필드값이 동일한지 검사한 후
				return true;				//동일하면 true 리턴
			}
			
		}
		return false;						//매개값이 Member타입이 아니거나 id 필드값이 다른 경우 false;
	}
	@Override
	public int hashCode() {
		return id.hashCode();		//id가 동일한 문자열인 경우 같은 해시 코드를 리턴
	}
	
}
