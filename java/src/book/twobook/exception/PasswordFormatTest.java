package book.twobook.exception;

public class PasswordFormatTest {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordFormatException{
		if(password == null) {
			throw new PasswordFormatException("비밀번호는 null일 수 없음");
		}else if(password.matches("[a-zA-Z]+")) {
			if(password.length()<5)
			throw new PasswordFormatException("비밀번호는 5자리 이상");
		}
		this.password = password;
	}
	
	public static void main(String[] args) {

		PasswordFormatTest pf = new PasswordFormatTest();
		
		String pass1 = null;
		try {
			pf.setPassword(pass1);
		} catch (PasswordFormatException e) {
			System.out.println(e.getMessage());
		}
		
		String pass2 = "abdf";
		try {
			pf.setPassword(pass2);
		} catch (PasswordFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
