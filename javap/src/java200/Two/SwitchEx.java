package java200.Two;

public class SwitchEx {

	//CASe 예제
	/**
	 * ii?
	 * */
	
	public static String textInfo(int index, double value) {
		String result ="";
		
		switch(index) {
			case 23 : result ="신체 지수 : "; break;
			case 28 : result ="감정 지수 : "; break;
			case 33 : result ="지성 지수 : "; break;
		}
		return result +(value*100);
	}
	
	void execute() {
		int index = 23;
		double value = 0.86;
		String st = textInfo(index, value);
		System.out.println(st);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
