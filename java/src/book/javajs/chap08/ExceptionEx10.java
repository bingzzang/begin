package book.javajs.chap08;

public class ExceptionEx10 {

	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메소드에서 예외가 처리되었습니다");
			e.printStackTrace();
		}
	}
}
