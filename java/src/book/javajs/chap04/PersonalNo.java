package book.javajs.chap04;

import java.util.Scanner;

public class PersonalNo {

	public static void main(String[] args) {
		String no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하시오");
		no = sc.nextLine();
		
		char gender = no.charAt(7);	//해당인덱스에 있는 문자열을 가져옴

//		switch (gender) {
//		case'1': case '3':
//			System.out.println("남자");
//			break;
//		case'2': case '4':
//			System.out.println("여자");
//			break;
//		default:
//			System.out.println("입력오류");
//		}
		switch (gender) {
		case'1': case '3':
			switch (gender) {
			case'1': 
					System.out.println("2000년 이전 출생 남자");
					break;
			case '3':
				System.out.println("2000년 이후 출생 남자");
				break;
			}
			break;
		case'2': case '4':
			switch (gender) {
			case'2': 
				System.out.println("2000년 이전 출생 여자");
				break;
			case '4':
				System.out.println("2000년 이후 출생 여자");
				break;
			}
			break;
		default:
			System.out.println("입력오류");
		}
	}
}
