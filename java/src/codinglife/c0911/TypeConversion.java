package codinglife.c0911;

public class TypeConversion {

	public static void main(String[] args) {
		double a = 3.0F;	//자동형변환. 3.0f를 자동으로 double형의 3.0으로 변환 float<double
		
//		float b = 3.0;	 에러. 형변환 필요, float<double
		float b = (float) 3.0; //명시적 형변환
		
		int x = 3;
		float y = 1.0f;
		double z = x+y;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
