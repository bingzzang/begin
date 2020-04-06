package book.javajs.chap04;

public class TestEx01 {

	public static void main(String[] args) {
		
		System.out.println("[4-1-1]");
		int x = 13;
		
		if(x>10 && x<20) {
			System.out.println("true");
		}else { System.out.println("false");}
		
		System.out.println("[4-1-2]");
		
		char ch = 'A';
		
		if(ch!=' '&& ch!='\t') {
			System.out.println("true");
		}else { System.out.println("false");}
		
		System.out.println("[4-1-3]");
		char ch2 = '3';
		if(ch2 >='0' && ch2<='9') {
			System.out.println("true");
		}else { System.out.println("false");}
		
		
	}
}
