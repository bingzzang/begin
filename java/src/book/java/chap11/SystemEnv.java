package book.java.chap11;

public class SystemEnv {

	public static void main(String[] args) {
		String javahome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : "+javahome);
	}
}
