package book.java.chap07;

public class PhoneEx {
	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		Smartphone smartphone = new Smartphone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}
}
