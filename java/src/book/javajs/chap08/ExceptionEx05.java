package book.javajs.chap08;

public class ExceptionEx05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);		//예외가 발생해서 실행되지 않음
		} catch (ArithmeticException e) {
			System.out.println(5);	
		}
		System.out.println(6);
	}
}
