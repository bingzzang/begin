package book.javajs.chap03;

public class TestEx06 {

	//num보다 크면서도 가장 가까운 10의 배수에서 num을 뺀 나머지를 구하는 코드

	public static void main(String[] args) {
//		int num = 24;
		int num = 39;
		
		System.out.println((num/10+1)*10 - num);
//		System.out.println(10 - num%10);
	}
}
