package book.java.chap11;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		String regExp = "(010)-\\d{4}-\\d{4}";
		String data = "010-1253-8253";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식에 일치합니다");
		}else {
			System.out.println("정규식에 일치하지 않습니다");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식에 일치합니다");
		}else {
			System.out.println("정규식에 일치하지 않습니다");
		}

	}

}
