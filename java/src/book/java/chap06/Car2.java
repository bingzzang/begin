package book.java.chap06;

public class Car2 {

	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car2(){
		
	}
	
	Car2(String model){
		this(model, "흰색", 250);
	}
	
	Car2(String model, String color){
		this(model, color, 250);
	}
	
	Car2(String model, String color, int maxSpped){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpped;
	}
}
