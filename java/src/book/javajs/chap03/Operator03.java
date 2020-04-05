package book.javajs.chap03;

public class Operator03 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
//		byte c = a+b; 컴파일 에러가 남
		
		byte c = (byte) (a+b);	//+는 int형으로 바꾼다음에 계산을 하므로 결과값이 int가 나와서 다시 형변환을 해줘야 한다.
		
		System.out.println(c);
	}
}
