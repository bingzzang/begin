package book.javajs.chap08;

public class ExceptionEx01 {

	public static void main(String[] args) {
		try {
			try {
				
			}catch(Exception e) {
				
			}
		}catch(Exception e) {
			try {
				
//			}catch(Exception e) {}	//변수 e가 중복선언됨
			}catch(Exception e2) {}
		}//try-catch의 끝
		
		try {
			
		}catch(Exception e) {}
	}
}
