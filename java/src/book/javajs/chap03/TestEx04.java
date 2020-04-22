package book.javajs.chap03;

public class TestEx04 {

	//변수 num의 값 중 백의 자리 이하를 버리는 코드.
	//456이면 400
	
	
	public static void main(String[] args) {
		int num = 456;
		
//		System.out.println(num - (num%100));
		System.out.println(num/100*100);
		
		/*
		 * 456/100 = 4
		 * 4* 100 = 400
		 * */
	}
}
