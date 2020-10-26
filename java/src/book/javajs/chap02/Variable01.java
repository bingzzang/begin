package book.javajs.chap02;

public class Variable01 {

	public static void main(String[] args) {
		int a = 30;
		
		int b = 90;
		
		int tmp;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
