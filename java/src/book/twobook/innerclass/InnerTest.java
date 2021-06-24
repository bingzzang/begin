package book.twobook.innerclass;

public class InnerTest {

	public static void main(String[] args) {
		OutClass oc = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		oc.usingClass();
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTests();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}
