package book.javajs.chap13;

public class ThreadEx1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		// Thread t2 = new Thread(new Thread#x1_2());  위의 두 줄을 한 줄로 
		
		t1.start();
		t2.start();
	}
}


