package book.javajs.chap03;

public class TestEx07 {
	//화씨(Fahrenheit)에서 섭씨(Celcius)로 변환
	//C = 5/9 * (F-32)
	public static void main(String[] args) {
		int f = 100;
		float c = (int) ((5/9f * (f-32)) * 100 + 0.5) / 100f;
		
		System.out.println(f);
		System.out.println(c);
	}
}
