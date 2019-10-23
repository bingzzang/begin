package basic.book.vol2;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
//		car.num = 2839; // private이라 불가능
		
		car.setNumGas(3820, 28.8);
		car.show();
		
		
	}

}
