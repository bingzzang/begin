package book.twobook.template;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new AutoCar();
		Car car2 = new ManualCar();
		
		car1.run();
		System.out.println();
		car2.run();
	}
}
