package book.java.chap02;

public class Variable {
	byte a = 1;
	char b = 65;
	char bb = 70;
	short c =1;
	int d = 1;
	long e=1;
	float z = 1;
	double i = 1;
	
	
	//	boolean w = 1;
	// 기본형 8가지
	// 정수형 : byte char short int long

	void test1() {
		System.out.println(""+a+b+c+d+e+z+i);
	}
	
	void test2() {
		System.out.println(b+bb);	//char는 정수형
		//결과값 :135
	}
	void test3() { 
		byte aa= 127;
		short bb = 32767;//(short) Math.pow(2, 15);
		int ac = 2147483647;//(int) Math.pow(2, 31);
		long aaa = 9223372036854775807L; //(long)Math.pow(2, 63);
		System.out.println(++aa);
		System.out.println(++bb);
		System.out.println(++ac);
		System.out.println(++aaa);
	}
	void test4() {
		double ff = 21474836471233333333333333333333422546543453233123123123121231231231231231233.0;

//		float f = 214748364712333333333333333333334225555F;
		System.out.println(ff+"\n"+ff/Math.pow(10, 76));
	}
	void test5() {		//부동소수점의 문제
	
		int apple = 1;
		double piceUnit = 0.1;
		int number = 7;
				
		double result = apple - number * piceUnit;  // 원하는 계산:  1 - 7 * 0.1 = 0.3
		System.out.println(result); // 결과 : 0.29999999999999993
	}
	public static void main(String[] args) {
		Variable v = new Variable();
//		v.test1();
//		v.test2();
//		v.test3();
//		v.test4();
		v.test5();
		
	}

}
/* 
byte = 8bit  2^8= 256
		-128~127
		-2^7~2^7-1

char = 2byte = 16bit 2^16 = 65536 
		-2^15~2^15-1

int = 4byte = 32bit 2^ 32= 
		-2^31~2^31-1
*/
		
