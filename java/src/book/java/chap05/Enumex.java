package book.java.chap05;

public class Enumex {
		//열거 타입 변수
	public enum week{
		MONDAY,
		TUESDAY,
		WENDESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	
	week today;
	week reservationDay;
	
	void m1() {
		week today = week.SATURDAY;
		System.out.println(today);
	}
	
	week birthday = null;

	
	public static void main(String[] args) {
		Enumex en = new Enumex();
		en.m1();

	}

}
