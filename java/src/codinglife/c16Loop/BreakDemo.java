package codinglife.c16Loop;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) break;
			
			System.out.println(i+"*\n");
		}
	}
}
