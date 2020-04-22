package lecture.java.sec02;

public class Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("오늘의 기온은 %d도 입니다.\n", 10);
		
		int i = 20;
		System.out.println("오늘의 기온은 "+i+"도 입니다.");
		
		System.out.printf("오늘의 기온은 %d도 입니다.\n", i);
		
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'A');
		
		System.out.printf("\'%s\'를 대문자로 바꾸면 \'%s\'입니다.", "java", "JAVA");
	}

}
