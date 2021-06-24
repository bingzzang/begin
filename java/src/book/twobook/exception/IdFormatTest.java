package book.twobook.exception;

public class IdFormatTest {

	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) throws IdFormatException{
		if(userId == null) {
			throw new IdFormatException("아이디는 null일 수 없음");
		}else if(userId.length()<8 || userId.length() >20) {
			throw new IdFormatException("아이디는 8~20");
		}
		this.userId = userId;
	}
	
	public static void main(String[] args) {
		IdFormatTest test = new IdFormatTest();
		
		String userId = null;
		try {
			test.setUserId(userId);
		} catch (IdFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userId = "1234567";
		try {
			test.setUserId(userId);
		} catch (IdFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
