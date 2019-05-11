package book.java.chap2;

public class VarChange {
	//byte short int long float double 순
	
	void test1() {
		byte bytevalue = 10;
		int intvalue = bytevalue;
		
		System.out.println(intvalue);
		
		int iv = 200;
		double dv = iv;
		
		System.out.println(dv);
		
		// 작은값 -> 큰값 : 자동형변환
	}
	
	void test2() {
		double dv = 300.0;
		int iv = (int)dv;
		
		System.out.println(iv);
		
		// 작은 크기 타입 = (작은크기타입)큰크기타입 : 강제타입변환
	}
	
	void test3() {
		int a =3;
		double b = 6.0;
		double result = a+b;
		
		System.out.println(result);
	}
	
	void test4() {
		byte a = 60;
		char b = 55;
		
		int re = a+b;	
		System.out.println(re);
	}
	
	void test5() {
		byte a =1;
		byte b = 3;
//		byte re = a+b;
//		(byte char short int) + (byte char short int) = int형으로 나옴
//		ㄴ 하나라도 long이 있으면 long타입으로 변환
	}
	public static void main(String[] args) {
		VarChange vc = new VarChange();
//		vc.test1();
//		vc.test2();
//		vc.test3();
		vc.test4();
	}

}
