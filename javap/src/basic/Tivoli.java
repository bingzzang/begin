package basic;

public class Tivoli {

	public static void main(String[] args) {
		Car car = new Car(100.0, "Navy", "Tivoli", 0, 5.0, 2, 300, 2000, 0.0);
		car.info();
		System.out.println("-----------");
		car.run(80);
		car.warningGas(2.0);
		car.warningSpeed(280);
		System.out.println("----------");
		car.sell(5);
	}

}
