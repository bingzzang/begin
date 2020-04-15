package java200.One;

public class BioCalendar {

	//상수
	//상수값은 변할 수 없음
	public static final int PHYSICAL = 23; //상수는 대문자 사용, 변수에 static final을 붙이면 상수가 된다.
	
	public static void main(String[] args) {
		
		System.out.println(PHYSICAL);
		int index = PHYSICAL;	//상수값을 변수에 대입
		
		//Math.PI 3.14에서 정의되어 있는 상수
		
		double val = 2* Math.PI/index;
		System.out.println(val+"라디안");
	}

}
