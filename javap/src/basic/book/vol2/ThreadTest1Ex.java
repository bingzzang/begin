package basic.book.vol2;

public class ThreadTest1Ex {

	public static void main(String[] args) {
		// TODO Auto-generat
		
		ThreadTest1 tt = new ThreadTest1("보라색");
		tt.start();	// 스레드 가동
		
		for(int i=0; i<5; i++) {
			System.out.println("메인 메소드 실행중");
		}
	}

}
