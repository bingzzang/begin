package java200.One;

public class Letters {
	//char, escape
	public static void main(String[] args) {
		char a = '닳';	//char는 ''로 감싼다. 문자열은 ""
		
		String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int letterNum = letter.length();	//문자열의 길이를 구한다
		int loc = letter.indexOf(a); 		//'닳'의 위치를 구한다
		
		System.out.printf("\"%s\" \n=> %d자이며, '%c'은 %d번째에 있다.\n", letter, letterNum, a, loc);
		
		char b = letter.charAt(loc); 		
		
		System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.", letter, loc, b);
	}

}
