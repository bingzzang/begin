package book.javajs.chap03;

public class TestEx01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; //65
		
		System.out.println(1+x << 33);
		System.out.println(y >= 5 || x < 0 && x>2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2); //x =5 
		System.out.println(!('A'<= c && c <='Z')); //대문자가 소문자보다 작음(아스키)
		System.out.println('C' - c); 
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
	}
}
