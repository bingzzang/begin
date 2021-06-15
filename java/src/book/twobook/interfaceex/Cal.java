package book.twobook.interfaceex;

public interface Cal {

	double PI = 3.14;
	int ERROR = -999999999;		//인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
