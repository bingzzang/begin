package book.java.chap3;

public class Operators {

	void test1() {
		int a = 1;
		int b = 3;
		
		int re = a^b;
		
		System.out.println(re);
		
		int x = -100;
		int re1 = +x;
		int re2 = -x;
		System.out.println(re1);
		System.out.println(re2);
	}
	
	
	void test2() {
		int x = 1;
		int y = 1;
		
		int re1 = ++x + 10;
		int re2 = y++ + 10;
		int z = y;
		
		System.out.println("re1 : "+re1);
		System.out.println("re2 : "+re2);
		System.out.println(z);
	}
	
	void test3() {
		byte a = 12;
		byte b = 10;
		System.out.println((a|b));
	}
	void test4() {
		boolean a = true;
		boolean b = false;
		System.out.println((a&b));
	}
	
	void test5() {
		int score = 90;
		char grade =(score>90)? 'A':((score>80)? 'B':'C');
					//조건식 ?		참 : 거짓
		System.out.println(score+"점 : "+grade);
	}
	public static void main(String[] args) {
		Operators op = new Operators();
//		op.test1();
//		op.test2();
//		op.test3();
//		op.test4();
		op.test5();
	}

}
