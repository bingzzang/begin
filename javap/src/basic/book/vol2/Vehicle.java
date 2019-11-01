package basic.book.vol2;

abstract class Vehicle {
	
	protected int speed;
	
	public void setSpeed(int s) {
		
		speed = s;
		System.out.println("속도 : "+speed);
	}
	
	abstract void show(); 		//몸체 x
}
