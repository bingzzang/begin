package lecture.java.sec03;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Morning car = new Morning();
		
		car.color = "white";
		car.gear = "auto";
		car.price = 1400;
		
		car.info();
		car.run();
		car.stop();
		
		Bicycle by = new Bicycle();
		
		by.color ="black";
		by.price = 20;
		by.info();
		
	}

}
