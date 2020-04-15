package basic.book.vol2;

public class ThreadTest1 extends Thread {

	private String color;
	
	public ThreadTest1(String c) {
		color = c;
	}
	
	// thread 클래스를 확장한 클래스는 반드시 그 안의 run() 메소드를 정의해주어야 한다.
	public void run() {
		for(int i=0;i<5; i++) {
			System.out.println(color+"이 나타남");
		}
	}
}
