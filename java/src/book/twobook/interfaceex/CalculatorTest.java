package book.twobook.interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteClac cal = new CompleteClac();
		System.out.println(cal.add(num1, num2));
		System.out.println(cal.substract(num1, num2));
		System.out.println(cal.times(num1, num2));
		System.out.println(cal.divide(num1, num2));
		System.out.println(cal.square(num1));
		cal.showInfo();
		cal.description();
		System.out.println();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Cal.total(arr));
	}
}
