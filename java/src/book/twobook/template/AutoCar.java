package book.twobook.template;

public class AutoCar extends Car{

	@Override
	public void drive() {
		System.out.println("차가 자동으로 주행합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("차가 자동으로 정지합니다.");
	}

}
