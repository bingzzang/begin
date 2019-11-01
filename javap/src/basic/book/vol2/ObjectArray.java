package basic.book.vol2;

public class ObjectArray {

	void m1() {
		Car[] cars = new Car[3];
			//배열 준비
		for(int i=0;i<cars.length;i++) {
			cars[i] = new Car();
		}
		//객체 생성 후 배열 요소가 그들을 가리키도록 대입
		cars[0].setNumGas(555, 65.4);
		cars[1].setNumGas(280, 32.2);
		cars[2].setNumGas(893, 22.1);
	}
	
	public static void main(String[] args) {
		ObjectArray oa = new ObjectArray();
		oa.m1();
	}

}
