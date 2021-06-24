package book.twobook.innerclass;

public class OutClass {

	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;	//내부 클래스 자료형 변수 먼저 선어
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
//		static int sInNum = 200;

		void inTest() {
			System.out.println("OutClass num = "+ num + "(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass snum = "+ sNum + "(외부클래스의 정적 변수)");
		}
		
	}
	public void usingClass(){
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTests() {
//			num  +=10;
			System.out.println("InStaticClass inNum = "+ inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = "+ sInNum + "(내부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = "+ sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = "+ sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
}
