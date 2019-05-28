package book.java.chap06;

public class Printer2 {
	static void println(int x) {
		System.out.println(x);
	}
	
	static void println(boolean y) {
		System.out.println(y);
	}
	
	static void println(double z) {
		System.out.println(z);
	}
	
	static void println(String n) {
		System.out.println(n);
	}
}

//일반적으로 중복을 막기 위해 static을 사용한다