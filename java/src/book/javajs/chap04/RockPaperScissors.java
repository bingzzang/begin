package book.javajs.chap04;

import java.util.Scanner;

public class RockPaperScissors {
	//가위바위보
	public static void main(String[] args) {
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		
		int user = sc.nextInt();
		int com = (int) (Math.random()*3)+1; 		//1,2,3중 랜덤
		
		System.out.println("user : "+ user);
		System.out.println("com : "+com);

		switch(user-com) {
		case 2: case -1:
			System.out.println("졌음");
			break;
		case 1: case -2:
			System.out.println("이김");
			break;
		case 0:
			System.out.println("비김");
		}
	}

}
