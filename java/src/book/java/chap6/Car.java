package book.java.chap6;

public class Car {
	
	private String company = "쌍용";
	private String model = "tivoli";
	private String color = "white";
	private int maxSpeed = 350;
	private int speed;
	
	Car(){
	}
	Car(String c, String m, String co, int ms, int s){
		this.company=c;
		this.model=m;
		this.color=co;
		this.maxSpeed=ms;
		this.speed=s;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
