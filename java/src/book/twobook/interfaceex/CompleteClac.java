package book.twobook.interfaceex;

public class CompleteClac extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Cal.ERROR;
	}
	
	@Override
	public int square(int num) {
		return num * num;
	}
	
	public void showInfo() {
		System.out.println("Cal 인터페이스 구현 완료");
	}

}
