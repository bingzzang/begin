package book.javajs.chap08;

public class ExceptionEx07 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생");
			throw e;
//			throw new Exception("고의로 발생");		위에 두줄을 한 줄로 줄이기 가능
		}catch(Exception e) {
			System.out.println("에러 메시지 : "+e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상 종료되었음");
	}
}
