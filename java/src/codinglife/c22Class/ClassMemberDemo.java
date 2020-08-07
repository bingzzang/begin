package codinglife.c22Class;

public class ClassMemberDemo {
	public static void main(String[] args) {
		C1 c = new C1();	//인스턴스 
		
		//인스턴스 -> 정적 메소드 접근  : 성공
		//인스턴스 메소드 -> 정적 변수 접근 : 성공
		c.static_static();
		
		//인스턴스 -> 정적메소드 접근 : 성공
		//정적 메소드 -> 인스턴스 변수 접근 : 실패
		c.static_instance();
		
		//인스턴스 -> 인스턴스 메소드 접근 : 성공
		//인스턴스 메소드 -> 클래스 변수 : 성공
		c.instance_static();
		
		//인스턴스 -> 인스턴스 메소드 접근 : 성공
		//인스턴스 메소드 -> 인스턴스 변수 접근 : 성공
		c.instance_instance();
		
		System.out.println("--");
		
		//클래스 -> 클래스 메소드 접근 : 성공
		//클래스 메소드 -> 클래스 변수에 접근 : 성공
		C1.static_static();
		
		//클래스 -> 클래스 메소드 접근 : 성공
		//클래스 메소드 -> 인스턴스 변수 접근 : 실패
		C1.static_instance();
		
		//클래스 -> 인스턴스 메소드 접근 : 실패
//		C1.instance_static();
		
		//클래스 -> 인스턴스 메소드 접근 : 실패
//		C1.instance_instance();
	}
}
