package basic.book.vol1;

public class Car {
	
	//기본 변수 초기화
	double gas;
	String color;
	String name;
	int speed;
	double minGas;
	int age;
	int maxSpeed;
	double price;
	double sellPrice;
	
	public Car() {
		
	}
	public Car(double gas, String color, String name, int speed, double minGas, int age, int maxSpeed, double price, double sellPrice) {
		super();
		this.gas = gas;
		this.color = color;
		this.name = name;
		this.speed = speed;
		this.minGas = minGas;
		this.age = age;
		this.maxSpeed=maxSpeed;
		this.price=price;
	}
	void info() {
		System.out.println("차 모델 : "+name);
		System.out.println("차 색상 : "+color);
		System.out.println("최고속도 : "+maxSpeed);
		System.out.println("가격 : "+price);
	}
	void run(int speed) {
		System.out.println("현재속도 "+speed+"km로 주행중입니다");
		
	}
	void warningGas(double gas) {
		if(gas>0 && gas<=minGas) {
			System.out.println("기름이 부족합니다. 주유 필요");
			System.out.println("현재 남음 기름 :" +gas);
		}else if(gas==0.0) {
			System.out.println("시동이 꺼집니다");
		}else {
			System.out.println("기름이 충분합니다");
		}
	}
	void warningSpeed(int speed) {
		if(speed> maxSpeed) {
			System.out.println("차량이 폭발함");
		}else if(speed>=200){
			System.out.println("과속!!");
			System.out.println("감속이 필요");
		}else if(speed<=20){
			System.out.println("너무 느립니다");
		}else {
			System.out.println("정상속도입니다");
		}
	}
	
	void sell(int age) {
		if(age>=15) {
			sellPrice = price * 0.3;
			System.out.println("중고가격은 "+sellPrice+"만 원입니다");
		}else if(age>=10) {
			sellPrice = price * 0.4;
			System.out.println("중고가격은 "+sellPrice+"만 원입니다");
		}else if(age>=5) {
			sellPrice = price * 0.5;
			System.out.println("중고가격은 "+sellPrice+"만 원입니다");
		}else if(age>=3) {
			sellPrice = price * 0.6;
			System.out.println("중고가격은 "+sellPrice+"만 원입니다");
		}else {
			sellPrice = price * 0.7;
			System.out.println("중고가격은 "+sellPrice+"만 원입니다");
		}
	}
}
