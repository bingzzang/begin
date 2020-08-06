package codinglife.c0607;

public class CharString {

	public static void main(String[] args) {
		System.out.println('B');
		System.out.println('마');
//		System.out.println('마을');  문자가 아니라 문자열. ''는 문자만.
		System.out.println("마");
		System.out.println("마을");
		
		System.out.println();
		
		System.out.println("우리 "+"마을"); // 문자열끼리 결합할 때 + 사용
		
		System.out.println(1+1);		//숫자
		System.out.println("1"+"1");	//문자열
		
		
		System.out.println("Our town will be \"bigger\"."); // 큰따옴표 쓰고 싶을 때 앞에 \를 붙여준다 
		System.out.println("MY \nTOWN");	// 한 줄 바꾸고 싶을 때는 \n
		
	}

}
