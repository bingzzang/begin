package basic.ex.method;

public class MethodEx2 {

	void print() {
		System.out.println("메소드 호출");
//		return;	//void는 리턴타입이 없으므로 return을 쓰지 않는것이 좋지만 쓸 경우 아무 값이 없어야함
//		return 0; 	값을 넣게 되면 오류남
	}
	
	void print(int a) {
		System.out.println("결과값 : "+ a);
	}
	
	int makeInt() {
		int a = 11;
		int b = 22;
		
		return a+b;
	}
	public static void main(String[] args) {
		MethodEx2 m2 = new MethodEx2();
		m2.print();
		m2.print(m2.makeInt());
	}

}
