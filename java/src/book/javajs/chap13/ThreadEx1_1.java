package book.javajs.chap13;

public class ThreadEx1_1 extends Thread{

	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName()); 		//조상인 thread의 getname()을 호출
		}
	}
}
