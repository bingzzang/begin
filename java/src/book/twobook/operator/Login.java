package book.twobook.operator;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String strpwd = sc.nextLine();
		int pwd = Integer.parseInt(strpwd);
		
		if( id.equals("java")) {
			if(pwd == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 - 비밀번호 오류");
			}
		}else {
			System.out.println("로그인 실패 - 아이디 오류");
		}
	}
}
