package book.java.chap05;

public class ArrayEx {

	
	
	void test1() {
		int [] scores = {90, 15, 30, 80, 100};
		//타입 [] 변수 = {값}
		
		System.out.println("scores[0] : "+ scores[0] );
		System.out.println("scores[1] : "+ scores[1] );
		System.out.println("scores[2] : "+ scores[2] );
		System.out.println("scores[3] : "+ scores[3] );
		System.out.println("scores[4] : "+ scores[4] );
	}
	
	void test2() {
		int [] scores = {90, 15, 30, 80, 100};
		
		System.out.println("scores[1] : "+ scores[1]);
		scores[1] = 55;	//값 변경시
		
		System.out.println("scores[1] : "+ scores[1]);
	}
	
	void test3() {
		String [] names = null;	// 배열변수가 미리 되었을때
		names = new String[] {"한주화", "해롱이", "한범희"};
		//변수 = new 타입[]{값...}
		
		/*
		 * 타입[] 변수;
		 * 변수 = {값}
		 * -> 컴파일 에러
		 * */
		System.out.println("names[2] : "+names[2] );
	}
	
	void test4() {
		int[] intarr = new int[5];	//길이가 5인 int[]배열 생성, 모두 0으로 초기화
		String[] stringarr = new String[10]; // 모두 null로 초기화
		
		System.out.println("intarr[2] : "+intarr[2]);
		System.out.println("stringarr[3] : "+stringarr[3]);
		
	}
	public static void main(String[] args) {
		ArrayEx ae = new ArrayEx();
//		ae.test1();
//		ae.test2();
//		ae.test3();
		ae.test4();
	}

}
