package book.java.chap5;

public class StaticExample {
	
	static String a = "static field";
	String b = "instance field";
	
	static void m1() {
		System.out.println("static method");
	}
	void m2() {
		System.out.println("instance method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticExample se = new StaticExample();
		
		//static filed
		System.out.println(StaticExample.a);
		System.out.println(se.a);
		
		//instance field
		System.out.println(se.b);
		
		//static method 
		StaticExample.m1();
		se.m1();
		
		//instance method
		se.m2();
		
		

	}

}
