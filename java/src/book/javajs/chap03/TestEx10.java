package book.javajs.chap03;

public class TestEx10 {

	//대문자를 소문자로 변경
	
	public static void main(String[] args) {
		char ch = 'J';
		
//		char lowerCase = (ch<97) ? (char)(ch+32): ch;
		
		char lowerCase = ('A'<=ch && ch <= 'Z') ? (char)(ch+32): ch;
		System.out.println(ch);
		System.out.println(lowerCase);
	}
}
