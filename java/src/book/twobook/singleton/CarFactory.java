package book.twobook.singleton;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	
	private static int serialNum = 10000;
	private CarFactory() {
	}

	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

	public static void setInstance(CarFactory instance) {
		CarFactory.instance = instance;
	}
	
	public Car createCar() {
		Car c1 = new Car();
		c1.setCarNum(serialNum++);
		return c1;
	}
	
}
