package basic.book.vol2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank {

	private String sin;
	private String name;
	private int balance=0;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str;
	
	public void setInfo() {
		try {
			System.out.println("계좌 개설을 시작합니다.");
			
			System.out.println("계좌번호>");
			sin = br.readLine();
			
			System.out.println("이름 > ");
			name = br.readLine();	
		
			System.out.println("설정완료");
			work();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	public void work() {
		System.out.println("어떤 업무를 하시겠습니까?");
		System.out.println("-----------------");
		System.out.println("1. 계좌개설 | 2. 계좌 조회 | 3. 입금 | 4. 출금| 5. 종료");
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			if(num ==1) {
				setInfo();
			}else if(num==2) {
				if(sin==null && name==null) {
					setInfo();
				}
				show();
			}else if(num==3) {
				if(sin==null && name==null) {
					setInfo();
				}
				deposit();
			}else if(num==4) {
				if(sin==null && name==null) {
					setInfo();
				}
				withdraw();
			}else {
				System.out.println("종료합니다");
				System.exit(0);
			}
		}catch(Exception e) {
			System.out.println(e);
			work();
		}
	}
	public void show() {
		System.out.println("이름 : "+name);
		System.out.println("계좌 : "+sin);
		System.out.println("잔액 : "+balance);
		work();
	}
	
	public void deposit() {
		try {
			int change = Integer.parseInt(br.readLine());
			balance += change;
			System.out.println("계좌 : "+sin);
			System.out.println("잔액 : "+balance);
			work();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	
	public void withdraw() {
		try {
			int change = Integer.parseInt(br.readLine());
			if(balance<change) {
				System.out.println("잔액이 부족합니다");
				work();
			}
			balance -= change;
			System.out.println("계좌 : "+sin);
			System.out.println("잔액 : "+balance);
			work();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
