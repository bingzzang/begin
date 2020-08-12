package codinglife.c28Overloading;

class Calculator {
	int left, right;
	int third = 0;
	
	public void setOperands(int left, int right) {
		System.out.println("setOperands(int left, int right)");
		this.left = left;
		this.right = right;

	}
	
	public void setOperands(int left, int right, int third) {
		System.out.println("setOperands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg() {
		System.out.println((this.left+this.right + this.third)/2);
	}
	
}
