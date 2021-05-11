package book.twobook.iteration;

public class Star1 {

	static void getStar1() {
		for(int i=0; i<4; i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void getStar2() {
		for(int i=0; i<4; i++) {
			for(int j=3;j>=i+1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void getStar3() {
	
		
	}
	public static void main(String[] args) {
		
//		getStar1();
//		getStar2();
		getStar3();
	}
}
