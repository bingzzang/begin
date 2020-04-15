package book.javajs.chap04;

import java.util.Scanner;

public class Authorization {

	public static void main(String[] args) {
		String name = "Steve";
		int level;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Steve의 등급 : ");
		level = sc.nextInt();
		
		switch(level) {
		case 3: System.out.println("삭제, 쓰기, 읽기 권한");
				break;
		case 2: System.out.println("쓰기, 읽기 권한");
				break;
		case 1: System.out.println("읽기 권한");
				break;
		default :
			System.out.println("입력 오류");
		}
	}
}
/*
 * switch문의 제약조건
 * 1. switch문의 조건식 결과는 정수 또는 문자열이어야 한다. (변수, 실수x)
 * 2. case문의 값은 정수 상수만 가능, 중복x
 * */
