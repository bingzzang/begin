package codinglife.c22Class;

public class CalculatorDemo2 {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		
		c1.setOperands(10, 20);
		c1.sum();
		
		Calculator2 c2 = new Calculator2();
		c2.setOperands(20, 40);
		c2.sum();
		
		System.out.println("--");
		Calculator2.base = 10;
		
		c1.sum();
		
		c2.sum();
		
	}
}
