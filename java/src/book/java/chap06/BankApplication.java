package book.java.chap06;

import java.util.Scanner;

public class BankApplication {

	private static BankAccount[] accountArr = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	
	//계좌생성하기
	private static void createAccount() {
		String ano;
		String owner;
		int balance;
		boolean chk=true;
			
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.println("");
		
		System.out.print("계좌주 : ");
		owner = scanner.next();
		System.out.println("");
		
		System.out.print("초기입금액 : ");
		balance = scanner.nextInt();
		System.out.println("");
		
		for (int i = 0; i < accountArr.length; i++) {
			if(accountArr[i]==null) {
				accountArr[i]=new BankAccount(ano, owner, balance);
				System.out.println("결과 : 계좌가 생성되었습니다.");
				chk=false;
				break;
			}
		}
		if(chk) {
			System.out.println("결과 : 계좌를 더이상 생성할 수 없습니다.");
		}
		
		
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		
		for (int i = 0; i < accountArr.length; i++) {
			if(accountArr[i] !=null)
			System.out.println(accountArr[i].getAno()+"\t" +accountArr[i].getOwner()+"\t" +accountArr[i].getBalance());
		}
	}
	
	//예금하기
	private static void deposit() {
		String ano;
		int depositamo;
		BankAccount acc;
		
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		
		acc=findAccount(ano);
	//	System.out.println(acc);
		if(acc==null) {
			return;
		}
		System.out.print("예금액 : ");
		depositamo = scanner.nextInt();
		acc.setBalance(acc.getBalance()+depositamo);
		
		System.out.println("결과 : 예금이 성공되었습니다.");
	}
	
	//출금하기
	private static void withdraw() {
		String ano;
		int withdrawamo;
		BankAccount acc;
		
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		
		acc=findAccount(ano);
		if(acc==null) {
			return;
		}
		System.out.print("출금액 : ");
		withdrawamo= scanner.nextInt();
		acc.setBalance(acc.getBalance()-withdrawamo);
		System.out.println("결과 : 출금이 성공되었습니다.");
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static BankAccount findAccount(String ano) {
		for (int i = 0; i < accountArr.length; i++) {
			if(accountArr[i]!=null && accountArr[i].getAno().equals(ano)) {
				return accountArr[i];
			}

		}
		return null;
	}

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run = false;
			}else {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}	
}