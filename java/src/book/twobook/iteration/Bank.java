package book.twobook.iteration;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			int num = sc.nextInt();
			
			int money = 0;
			
			switch(num) {
			case 1:
				System.out.print("입금할 금액 > ");
				money = sc.nextInt();
				balance += money;
				System.out.println("["+money+"원 입금 완료] \n잔고 : "+balance+"원");
				break;
			case 2:
				System.out.print("출금할 금액 > ");
				money = sc.nextInt();
				if(balance>=money) {
					balance -= money;
					System.out.println("["+money+"원 출금 완료] \n잔고 : "+balance+"원");
				}else{
					System.out.println("잔고가 부족합니다");
				}
				break;
			case 3:
				System.out.println("잔고 : "+balance+"원");
				break;
			default:
				System.out.println("-----------프로그램 종료-----------");
				run = false;
			}
		}
		
	}
}
