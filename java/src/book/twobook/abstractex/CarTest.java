package book.twobook.abstractex;

public class CarTest {

	public static void main(String[] args) {
		Bus b = new Bus();
		AutoCar a = new AutoCar();
		
		b.run();
		a.run();
		System.out.println();
		
		b.refuel();
		a.refuel();
		System.out.println();
		
		b.getPassenger();
		a.load();
		System.out.println();
		
		b.stop();
		a.stop();
	}
}
