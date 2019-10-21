package basic;

public class Tivoli2 {	 

	public static void main(String[] args) {
		Car car = new Car();
		car.name = "Tivoli";
		car.color = "White";
		car.maxSpeed= 280;
		car.price = 3000;
		
		System.out.println("차량 모델은 "+car.name+"입니다");
		car.info();
		System.out.println("---------------------");
		car.warningGas(30);
		car.warningSpeed(10);
		System.out.println("---------------------");
		car.sell(7);
		
		System.out.println("############################");
		
		Car car2 = new Car();
		car2.name = "Morning";
		car2.color = "Black";
		car2.maxSpeed= 250;
		car2.price = 2000;
		
		System.out.println("차량 모델은 "+car2.name+"입니다");
		car2.info();
		System.out.println("---------------------");
		car2.warningGas(50);
		car2.warningSpeed(100);
		System.out.println("---------------------");
		car2.sell(5);
	}

}
