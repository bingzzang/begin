package book.twobook.abstractex;

public abstract class Car {

	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	public abstract void refuel();
	public abstract void run();
}
