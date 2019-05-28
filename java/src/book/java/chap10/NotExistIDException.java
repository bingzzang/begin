package book.java.chap10;

public class NotExistIDException extends Exception{

	public NotExistIDException() {
		
	}
	public NotExistIDException(String message) {
		super(message);
	}
}
