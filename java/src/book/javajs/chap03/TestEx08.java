package book.javajs.chap03;

public class TestEx08 {

	
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		
		byte c = (byte)(a+b);
		
		char ch = 'A';
		ch = (char) (ch + 2);
		
//		float f =  (float)3/(float)2;
		float f = 3/2f;

//		long l = (long)3000 * (long)3000 * (long)3000;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2; 
		
		System.out.println(c);
		System.out.println(ch);
		System.out.println(f);
		System.out.println(l);
		System.out.println(result);
	}
}
