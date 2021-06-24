package book.twobook.innerclass;

public class Outer2 {

	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			//익명 내부 클래스
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}
