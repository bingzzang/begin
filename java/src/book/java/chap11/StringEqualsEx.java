package book.java.chap11;

public class StringEqualsEx {

	public static void main(String[] args) {
		String str1 = new String("해롱이");
		String str2 = "해롱이";
		
		if(str1==str2) { 		//번지 수 비교
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(str1.equals(str2)) {		//문자열만 비교
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
	}

}
