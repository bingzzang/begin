package book.javajs.chap04;

public class TestEx06 {

	public static void main(String[] args) {
		int x,y;
		
		int sum=0;
		
		for(int i=1; i<=6; i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==6) {
					System.out.println("["+i+", "+j+"]");
					
				}
			}
		}
	}
}
