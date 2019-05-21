package book.java.chap4;

import java.util.*;

class Ex5 
{
	// while문과 scanner이용
	//키보드로부터 입력된 데이터 -> 예금, 출금, 조회, 종료 기능을 제공하는 코드

	boolean run = true;
	int balance =0;
	int deposit, withdraw;
	int num;

	void m1() throws Exception{
		

		Scanner sc = new Scanner(System.in);		//키보드로 입력

		while (run){
			System.out.println("--------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
			System.out.println("--------------------------------------");
			
			System.out.print("선택 > " );
			num = sc.nextInt();
		//	System.out.println(num);

			if (num==1){
				System.out.print("예금액 > ");
				deposit = sc.nextInt();
				System.out.println(deposit);
				balance +=deposit;
			}else if (num==2){
				System.out.print("출금액 > ");
				withdraw = sc.nextInt();
				System.out.println(withdraw);
				balance -=withdraw;
			}else if (num==3){
				System.out.print("잔고 > ");
				System.out.println(balance);
				
			}else if(num==4){
				run = false;
			}else {
				System.out.println("입력 오류");
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}
	public static void main(String[] args) throws Exception
	{
		Ex5 e5 = new Ex5();
		e5.m1();
	}
}
