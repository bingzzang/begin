package basic.ex.method;

public class MethodEx3 {
	/* 
	 * Call by Value(값에 의한 호출 방식)
	 * 메서드 호출 시 값이 복사되어 전달
	 */
	
	public int increase(int n) {
		++n;
		return n;
	}
	public static void main(String[] args) {
		int value = 100;
		MethodEx3 m3 = new MethodEx3();
		int m = m3.increase(100);
		System.out.println(m);
	}

}
