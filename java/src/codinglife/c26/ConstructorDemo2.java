package codinglife.c26;

public class ConstructorDemo2 {

	public ConstructorDemo2(int param) {
		System.out.println(param);
	}
	public static void main(String[] args) {
//		ConstructorDemo2 c = new ConstructorDemo2(); 에러
		ConstructorDemo2 c = new ConstructorDemo2(2);
	}
}
