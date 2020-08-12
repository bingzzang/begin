package codinglife.c28Overloading;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		
		c1.setOperands(10, 20, 30);
		c1.sum();
		c1.avg();
	}
}
