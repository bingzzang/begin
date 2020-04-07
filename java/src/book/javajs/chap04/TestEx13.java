package book.javajs.chap04;

public class TestEx13 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0;i<value.length();i++) {
		 ch = value.charAt(i);
		 
//		 if(ch>='0' && ch<='9') {
//			 isNumber = true;
//		 }else {
//			 isNumber = false;
//			 break;
//		 }
		 if(!(ch>='0' && ch<='9')) {
			isNumber = false;
			break;
		 }
		 
		}
		
		if(isNumber) {
			System.out.println("숫자");
		}else {
			System.out.println("숫자가 아님");
		}
	}
}
