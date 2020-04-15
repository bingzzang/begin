package java200.One;

public class JavaTypeConversion {
	//타입 변환의 필요성
	public static void main(String[] args) {
		String number = "39.5485456456123       ";
		
		//공백 제거 후 double로 타입 변환
		double num = Double.parseDouble(number.trim()); 	//trim() : 양쪽 공백 제거
		
		System.out.println(num);

	}

}
