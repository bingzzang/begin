package codinglife.c25Inheritance;

public class CalculatorDemo2 {

	public static void main(String[] args) {
		MultiplicationableCalculator c = new MultiplicationableCalculator();
		c.setOperands(30, 10);
		c.sum();
		c.avg();
//		c.subtract();
		c.multiple();
	}
}
