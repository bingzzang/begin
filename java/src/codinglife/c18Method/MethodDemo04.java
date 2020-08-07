package codinglife.c18Method;

public class MethodDemo04 {

	public static void numbering(int init, int limit) {
		int i=init;
		while(i<limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(1,8);
	}
}
