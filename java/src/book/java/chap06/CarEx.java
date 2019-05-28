package book.java.chap06;

public class CarEx {

	public static void main(String[] args) {
		//객체를 생성
		Car car = new Car();
		
		
		
		//필드값 읽기
		System.out.println("제작회사 : "+car.getCompany());
		System.out.println("모델명 : "+car.getModel());
		System.out.println("색깔 : "+car.getColor());
		System.out.println("최고속도 : "+car.getMaxSpeed());
		System.out.println("현재속도 : "+car.getSpeed());
		
		car.setSpeed(100);
		System.out.println("속도 : "+car.getSpeed());
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("");
		Car car2 = new Car("Audi","R8","Red",300,100);
		//필드값 읽기
		System.out.println("제작회사 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색깔 : "+car2.getColor());
		System.out.println("최고속도 : "+car2.getMaxSpeed());
		System.out.println("현재속도 : "+car2.getSpeed());
		
	}

}
