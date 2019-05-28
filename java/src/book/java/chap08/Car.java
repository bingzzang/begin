package book.java.chap08;

public class Car {

	/*
	Tire frontLeft = new HankookTire();
	Tire frontRight = new HankookTire();
	Tire backLeft = new HankookTire();
	Tire backRight = new HankookTire();
	*/
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		/*
		frontLeft.roll();
		frontRight.roll();
		backLeft.roll();
		backRight.roll();
		*/
		for(Tire tire : tires) {
			tire.roll();
		}
	}
	
}
