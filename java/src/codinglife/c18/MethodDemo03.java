package codinglife.c18;

public class MethodDemo03 {

	public static void numbering(int limit) {
		int i=0;
		while(i<limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(7);
	}
}
