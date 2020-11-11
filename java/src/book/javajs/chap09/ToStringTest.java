package book.javajs.chap09;

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());		//String인스턴스가 갖고 있는 문자열을 반환
		
		System.out.println(today);
		System.out.println(today.toString());	//Date인스턴스가 갖고 있는 날짜와 시간을 문자열로 변환 후 반환
	}
}
