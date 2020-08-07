package codinglife.c21Object;

public class CalculatorDemo3 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.setOperands(10, 20);
		c.sum();
		c.avg();
		
		System.out.println("--");
		
		Calculator c2 = new Calculator();
		
		c2.setOperands(20, 40);
		c2.sum();
		c2.avg();
	} 	
	
}
