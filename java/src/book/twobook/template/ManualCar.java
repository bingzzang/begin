package book.twobook.template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("차를 수동으로 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("차를 수도응로 정지시킵니다.");
	}

}
