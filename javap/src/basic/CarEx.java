package basic;

public class CarEx {
	int num = 3222;
	double gas = 32.3;
	
	void show(int num, double gas) {
		System.out.println("차량 번호 : "+this.num);	//'자기 자신'의 필드  -> carEx에 선언된 전역변수
		System.out.println("연료 양 : "+this.gas);
	}
	void show2(int num, double gas) {
		System.out.println("차량 번호 : "+num);	
		System.out.println("연료 양 : "+gas);
		show(390,28.9);
	}
	public static void main(String args[]) {
		CarEx ce = new CarEx();
		System.out.println(ce.num);
		ce.show(8099, 40.2);
		System.out.println("----------");
		ce.show2(8099, 40.2);
	}
}
