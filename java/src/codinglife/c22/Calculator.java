package codinglife.c22;

public class Calculator {

	static double PI = 3.14;
	
	static int base = 0;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		System.out.println((this.left + this.right + base) / 2);
	}
	
}


