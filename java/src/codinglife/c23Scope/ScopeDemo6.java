package codinglife.c23Scope;

public class ScopeDemo6 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m(); 	//지역변수 > 전역변수 (메소드 안에서)
	}
}
