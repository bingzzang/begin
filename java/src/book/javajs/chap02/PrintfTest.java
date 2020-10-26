package book.javajs.chap02;

public class PrintfTest {

	public static void main(String[] args) {
		int age = 28;
		
		System.out.printf("age : %d%n", age);
		System.out.printf("age : %d%n", 28);
		
		int year = 2020;
		System.out.printf("age:%d%nyear:%d", age, year);
	}
}
