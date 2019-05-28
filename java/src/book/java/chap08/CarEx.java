package book.java.chap08;

public class CarEx {

	public static void main(String[]args) {
		Car mycar = new Car();
		
		mycar.run();
		
		mycar.tires[0]= new KumhoTire();
		mycar.tires[1] = new KumhoTire();
		
		mycar.run();
	}
}
