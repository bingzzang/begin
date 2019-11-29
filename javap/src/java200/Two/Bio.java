package java200.Two;

public class Bio {

	public static final int PHYSICAL = 23; //상수(개발자 정의)
	
	//Math 함수
	void info01() {
		int index = PHYSICAL;
		int days = 1200;
		
		double phyval = 100 * Math.sin((days % index) * 2 * Math.PI/index);
		
		System.out.printf("신체지수는  %1$.2f입니다\n", phyval);
	}
	
	//static
	public static double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	
	void execute() {
		int days = 1200;
		
		//static메소드는 객체 생성 없이 호출할 수 있다
		double phyval = getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("신체 지수 : %1$.2f\n", phyval);
	}
	public static void main(String[] args) {
		Bio bio = new Bio();
//		bio.info01();
		bio.execute();

	}

}
/*
 * Math 클래스는 java.util 패키지에 있고 대부분 static으로 객체 생성 없이 Math.메소드() 형식으로 사용된다
 * 대표적인 상수로 Math.PI = 3.14, Math.E = 2.718(자연지수)가 있다.
 * toDegrees() 각도 변경, random() 0과 1사이의 임의의 실수도 Math 클래스에 속한다.
 * sin(), cos() 등등 수학함수가 있다
 * 
 * */
