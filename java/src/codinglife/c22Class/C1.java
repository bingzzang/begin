package codinglife.c22Class;

public class C1 {

	static int static_variable = 1;		//클래스 변수
	int instance_variable = 2;			//인스턴스 변수
	
	
	static void static_static() {		//클래스 메소드
		System.out.println(static_variable);
	}
	
	static void static_instance() {		//클래스 메소드
		//클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
//		System.out.println(instance_variable);
	}
	
	void instance_static() {		//인스턴스 메소드
		//인스턴스 메소드에서는 클래스 변수에 접근할 수 있다.
		System.out.println(static_variable);
	}
	
	void instance_instance() {		//인스턴스 메소드
		System.out.println(instance_variable);
	}
}
