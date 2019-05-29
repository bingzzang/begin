package book.java.chap11;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone p = new SmartPhone("삼성", "안드로이드");
		
		String strObj = p.toString();
		System.out.println(strObj);
		System.out.println(p);

	}

}
