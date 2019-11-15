package java200.One;

public class HighHill {
	//실수 변수, 연산
	public static void main(String[] args) {
		double s = 2;			//영국 신발 사이즈 - 215mm
		double p = 0.75;		//75% 히트할 확률
		double l = 200;			//200파운드 
		double t = 0;			//0년 (올해 유행)
		double a = 1; 			//음주량 0잔 8.83cm, 1잔 4.42cm
		double y = 2;			//착용년도
		
		double ups1 = p*l*(y+9);
		double downs = (t+1)*(a+1)*(y+10)*(l+20);
		
		double ups2 = 12+3*s/8.0;
		double high = ups1 / downs * ups2;	//밝혀낸 식
		
		System.out.printf("적당한 하이힐의 높이는 %1$.2fcm입니다.",high);
										//%1$ high를 1$위치에 대입하란 소리
										// %f는 실수, %.2f는 소수점(.) 두자리 까지만 표시하란 소리
	}

}
