package book.javajs.chap04;

public class TestEx10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum +=num%10;

			num /=10;
		}
		
		System.out.println("---");
		System.out.println(sum);
	}
}
