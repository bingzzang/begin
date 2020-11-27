package book.javajs.chap13;

public class ThreadEx1_2 implements Runnable{

	public void run() {
		//Thread.currentThread();	 //현재 실행중인 thread를 반환
		
		for(int i=0;i<5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
