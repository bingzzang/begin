package book.javajs.chap03;

public class Operator04 {

	public static void main(String[] args) {
		char c1 = 'a'; //97
		char c2 = c1;
		char c3 = ' '; //공백 초기화
		
		int i = c1 +1;
		System.out.println(i);
		
		c3 = (char) (c1+1);
		System.out.println(c3);
		
		c2++;
		System.out.println(c2);
		c2++;
		System.out.println(c2);
	}
}
