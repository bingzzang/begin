package basic.book.vol2;

public class Tivoli {
	
	private String color;
	private int num;
	private double gas;
	
	public Tivoli() {
		color="white";
		num = 1111;
		gas = 0.0;
		
		System.out.println("티볼리 생성");
	}
	public Tivoli(String c, int n, double g) {
		color = c;
		num = n;
		gas = g;
		
		System.out.println("custom tivoli 생성");
	}
	public void show() {
		System.out.println("차량 색깔은 "+color+"입니다.");
		System.out.println("연료 양은 "+gas+"입니다.");
	}
}


