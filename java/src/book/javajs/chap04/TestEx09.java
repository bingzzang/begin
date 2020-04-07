package book.javajs.chap04;

public class TestEx09 {

	public static void main(String[] args) {
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length();i++) {
			int temp = Character.getNumericValue(str.charAt(i));
			System.out.println(temp);
			sum +=temp;
		}
		System.out.println("----");
		System.out.println(sum);
	}
}
