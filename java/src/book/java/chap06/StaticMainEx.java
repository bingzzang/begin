package book.java.chap06;

public class StaticMainEx {

	public static void main(String[] args) {
		double result1 = 10 * 10 * StaticEx.pi;
		
		int result2 = StaticEx.plus(10, 5);
		int result3 = StaticEx.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		
	}
}
