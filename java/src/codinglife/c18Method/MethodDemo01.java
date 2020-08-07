package codinglife.c18Method;

public class MethodDemo01 {

	//메소드 정의
	public static void numbering() {
		int i = 1;
		while (i<11) {
			System.out.println(i);
			i++;
		}
	}
	
	//메소드 호출
	public static void main(String[] args) {
		numbering();
		System.out.println("--");
		numbering();
	}
}
