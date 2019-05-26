package book.java.chap7;

public class Smartphone extends Phone{
	
	//생성자
	public Smartphone(String owner) {
		super(owner);
		
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}
