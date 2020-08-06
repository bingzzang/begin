package codinglife.c22;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperands(10, 20);
		c.sum();
		
		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();
		
		Calculator.base = 100;
		
		c.sum();
		
		c2.sum();
	}
}
