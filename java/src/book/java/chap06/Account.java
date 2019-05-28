package book.java.chap06;

public class Account {

	private int balance;
	
	final static int MIN_BALANCE=0;
	final static int MAX_BALANCE=1000000;	//상수는 초기화를 해주어야 함
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance>=MIN_BALANCE && balance<=MAX_BALANCE) this.balance = balance;
	}
	

}
