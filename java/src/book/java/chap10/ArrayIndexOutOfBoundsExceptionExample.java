package book.java.chap10;

public class ArrayIndexOutOfBoundsExceptionExample {

	//배열에서 인덱스 범위를 초과하여 사용할 경우
	
	public static void main(String[] args) {
		if (args.length ==2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println(data1);
			System.out.println(data2);
		}else {
			System.out.println("실행방법");
			System.out.println("--------------------");
			System.out.println("java ; ArrayIndexOutOfBoundsException");
			System.out.println("--------------------");
			System.out.println("값 1 값2");
		}
	}
}
