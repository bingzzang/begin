package codinglife.c37Exception;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.divide();	//에러남
		
		Calculator c2 = new Calculator();
		c2.setOperands(10, 5);
		c2.divide();

	}
}
