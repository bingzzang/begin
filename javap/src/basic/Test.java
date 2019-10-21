package basic;

public class Test {

	public int money = 10000;
	private int money2 = 3000;
	
	public void test1() {
		test2();
	}
	private void test2() {
		System.out.println("해렁이 바보");
	}
	public static void main(String args[]) {
		Test t = new Test();
		t.test1();
	}
}
