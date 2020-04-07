package book.javajs.chap04;

import java.util.Scanner;

public class TestEx14 {

	public static void main(String[] args) {
		//1~100사이의 임의의 값을 얻어서 answer에 저장
		
		int answer = (int)(Math.random()*100)+1;
		
		int input = 0;	//사용자 입력 
		int count = 0;	//시도 횟수
		
		Scanner sc = new Scanner(System.in);
		do {
			count++;
			System.out.println("1~100 입력");
			input = sc.nextInt();
			if(input<answer) {
				System.out.println("큰 수 입력");
			}else if(input>answer) {
				System.out.println("작은 수 입력");
			}else if(answer==input) {
				System.out.println("이김");
				System.out.println("com :"+answer+", 시도 횟수 : "+count);
				break;
			}
		}while(true);
		
		
	}
}
