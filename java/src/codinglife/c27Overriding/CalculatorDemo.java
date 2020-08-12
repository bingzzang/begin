package codinglife.c27Overriding;

public class CalculatorDemo {

	public static void main(String[] args) {
		SubtractionableCalculator c = new SubtractionableCalculator();
		c.setOperands(30, 10);
		c.sum();
		c.avg();
		c.subtract();
	}
}
