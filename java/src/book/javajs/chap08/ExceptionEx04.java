package book.javajs.chap08;

public class ExceptionEx04 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);	//예외가 발생하지 않아 실행되지 않음
		}
		System.out.println(6);
	}
}
