package java200.One;


public class JavaUserDefinedType {
	//사용자 정의 클래스
	public static void main(String[] args) {
		// 두 개의 기본 타입
		double xx = 37.522483245354;
		double yy = 127.0024875215645;
		
		//사용자 정의 객체 생성
		JLocation j = new JLocation();
		j.x = xx;
		j.y = yy;	//값을 대입
		
		JLocation newJ = j;			//객체 대입
		System.out.println(newJ.x); //출력
	}

}
