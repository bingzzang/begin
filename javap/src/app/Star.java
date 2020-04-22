package app;

public class Star {

	void star1() {
		String star = "*";
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(star);
			}
			System.out.println();
		}
	}
	
	void star2() {
		String star ="*";
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
	
	void star3() {
		String star ="*";
		String space =" ";

		for(int i=1;i<=5;i++) {
			for(int j=5;j>0;j--) {
				if(i<j) {
					System.out.print(space);
				}else {
					System.out.print(star);
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Star st = new Star();
		st.star1();
		st.star2();
		st.star3();
	}

}
