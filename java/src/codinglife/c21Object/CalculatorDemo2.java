package codinglife.c21Object;

public class CalculatorDemo2 {

	public static void sum (int left, int right) {
		System.out.println(left+right);
	}
	
	public static void main(String[] args) {
		sum(10, 20);
		sum(20, 40);
	} 	//리팩터링 : 기존 코드와 동일하게 동작하지만 코드의 내용을 개선해서 더 효율적으로 만드는 행위
	
}
