package book.twobook.variable;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C'; 	//유니코드(16진수)
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		byte byteValue = 10;
		char charValue = 'A';
		
		System.out.println("----");
		
		int intValue = byteValue;
		System.out.println(intValue);
		
		int intValue2 = charValue;
		System.out.println(intValue2);
		
//		short shortValue = charValue;
//		System.out.println(shortValue);
		
		double doubleValue = byteValue;
		System.out.println(doubleValue);

		
	}
}
