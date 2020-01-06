package begin.book;

public class Star {

	String str = "*";
	String space =" ";
	
	void makeone() {
		for(int i =0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str);
			}
			System.out.println();
		}
		
	}
	
	void maketwo() {
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	
	}
	void makethree() {
		
		for(int i=5;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(space);
			}
			for(int k=5;k>=i;k--) {
				System.out.print(str);
			}
			if(i>1) {
				System.out.println();
			}
			
			
		}
		
		for(int i =0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str);
			}
			System.out.println();
		}
		
	}
	void makefour() {
		for(int i=0;i<=5;i++) { // 전체 줄
			for(int s=5;s>i;s--) {
				System.out.print(space);
			}
			for(int st=1;st<=i;st++) {
				System.out.print(str);
			}
			for(int j=0;j<=i;j++) {
				System.out.print(str);
			}
			System.out.println();
		
		}
		
	}
	void makefive() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(space);
			}
			for(int k=5;k>=i;k--) {
				System.out.print(str);
			}
			for(int k=5;k>i;k--) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
	
	void makesix() {
		for(int i=0;i<=4;i++) { // 전체 줄
			for(int s=5;s>i;s--) {
				System.out.print(space);
			}
			for(int st=1;st<=i;st++) {
				System.out.print(str);
			}
			for(int j=0;j<=i;j++) {
				System.out.print(str);
			}
			System.out.println();
		
		}
		for(int i=0;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(space);
			}
			for(int k=5;k>=i;k--) {
				System.out.print(str);
			}
			for(int k=5;k>i;k--) {
				System.out.print(str);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Star s = new Star();
//		s.makeone();
//		s.maketwo();
//		s.makethree();
//		s.makefour();
//		s.makefive();
		s.makesix();
	}

}
