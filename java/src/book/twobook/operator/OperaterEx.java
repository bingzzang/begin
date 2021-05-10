package book.twobook.operator;

public class OperaterEx {

	public static void main(String[] args) {
		int value = 956;
		
		System.out.println(value / 100 * 100);
		
		System.out.println("------");
		
		float var1 = 10f;
		float var2 = var1 / 100;
		
		if (var2 == 0.1f) {
			System.out.println("10%입니다");
		}else {
			System.out.println("10%가 아닙니다");
		}
	}
}
