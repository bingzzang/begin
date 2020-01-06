package begin.book;

public class BoxTest {

	int width, height, depth;
	//클래스 내에서 선언된 인스턴스 변수
	
	
	int calcVolueme(int w, int h, int d) {
		width = w;
		height = h;
		depth=d;
		
		int volume = width*height*depth;
		
		return volume;
	}
	public static void main(String[] args) {
		BoxTest b = new BoxTest();
		

		int h = 2;
		int w = 5;
		int d = 5;
		System.out.println(" 부피 : "+b.calcVolueme(w, h, d));
		
	}

}
