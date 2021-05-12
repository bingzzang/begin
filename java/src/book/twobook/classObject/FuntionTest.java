package book.twobook.classObject;

public class FuntionTest {

	public static int add(int num1, int num2) {
		
		int result = num1 + num2;
		
		return result;
	}
	
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		
		return result;
	}
	public static int multiple(int num1, int num2) {
		int result = num1 * num2;
		
		return result;
	}
	
	public static int divide(int num1, int num2) {
		int result = num1 / num2;
		
		return result;
	}
	
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1+"+"+num2+"="+sum);
	}
}
