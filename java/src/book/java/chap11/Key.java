package book.java.chap11;

public class Key {		//객체 해시코드(hashCode())

	public int number;
	
	public Key(int number) {
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;				//해시코드 값이 같고
			if(this.number==compareKey.number) {	//equals 리턴값도 true면
				return true;						//true
			}
		}	
		return false;								//둘 중 하나라도 다르면 false
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}
