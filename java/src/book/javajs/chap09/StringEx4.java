package book.javajs.chap09;

public class StringEx4 {

	public static void main(String[] args) {
		int i = 100;
		String is = i+"";
		System.out.println(is);
		
		String is2 = String.valueOf(i);
		System.out.println(is2);
		
		String fullName = "Hello.java";
		int idx = fullName.indexOf('.');
		String fileName = fullName.substring(0, idx);
		String ext = fullName.substring(idx+1);
		System.out.println(fileName);
		System.out.println(ext);
	}
}
