package codinglife.c15;

public class OrDemo {

	public static void main(String[] args) {
		if(true || true) {
			System.out.println(1);
		}
		
		if(true || false) {
			System.out.println(2);
		}
		
		if(false || true) {
			System.out.println(3);
		}

	}

}
