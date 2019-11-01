package basic.book.vol2;

public class NullEx {
	Car car;
	
	void ex1() {
		car = new Car();
		
		car = null;
		
		System.out.println(car);
	}
	
	public static void main(String args[]) {
		NullEx ne = new NullEx();
		ne.ex1();
	}
}
