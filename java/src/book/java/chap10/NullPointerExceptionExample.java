package book.java.chap10;

public class NullPointerExceptionExample {
 
	//객체 참조가 없는 상태
	// null 값을 갖는 참조 변수로 객체 접근 연산자인 도트(.)를 사용했을 때
	//객체가 없는 상태에서 객체를 사용하려 할 때
	
	public static void main(String [] args) {
		String data = null;
		System.out.println(data.toString());
	}
}
