package book.javajs.chap08;

public class FinallyEx01 {

	static void startInstall() {
		
	}
	
	static void copyFiles() {
		
	}
	
	static void deleteTempFiles() {
		
	}
	
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}
	}
}
