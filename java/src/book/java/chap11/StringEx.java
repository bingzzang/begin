package book.java.chap11;

public class StringEx {

	void subStringEx() {
		String ssn = "880815-1234556";
		
		String firstNum = ssn.substring(0,6);	//subString(0,6) 0(포함)~6(제외)
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	//7 이후의 문자열
		System.out.println(secondNum);
	}
	
	void toLowerUpperCaseEx() {
		/* toLowerCase() : 문자열을 모두 소문자로
		 * toUpperCase() : 문자열을 모두 대문자로
		 * */
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(lowerStr1+", "+lowerStr2);
		
		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();
		
		System.out.println(upperStr1+", "+upperStr2);
	}
	
	void trimEx() {
		//문자열 앞 뒤 공백 잘라내기
		
		String tel1 = "            03";
		String tel2 = "09         ";
		String tel3 = "        3920        ";
		
		String tel = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
	}
	
	void valueOfEx() {
		//기본타입의 값을 String으로 변화하는 기능
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
	void splitEx() {	//util 패키지의 stringtokenizer 클래스와 비슷
	
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String names[] = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}
	
	public static void main(String[] args) {
		StringEx se = new StringEx();
//		se.subStringEx();
//		se.toLowerUpperCaseEx();
//		se.trimEx();
//		se.valueOfEx();
		se.splitEx();
	}

}
