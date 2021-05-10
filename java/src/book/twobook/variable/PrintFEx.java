package book.twobook.variable;

public class PrintFEx {

	public static void main(String[] args) {
		int value = 6500;
		
		System.out.printf("상품의 가격 :%d원\n", value);
		System.out.printf("상품의 가격 :%6d원\n", value);
		System.out.printf("상품의 가격 :%-6d원\n", value);
		System.out.printf("상품의 가격 :%06d원\n", value);
	}
}
