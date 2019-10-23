package basic.book.vol2;

public class Car {
	//private : 불필요한 조작을 막기 위해
	
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g) {
		if(g>0 && g<1000) {
			num = n;
			gas = g; 		//올바른 값일 경우 저장
			
			System.out.println("차량 번호를 "+num+"으로, 연료 양을 "+gas+"로 바꾸었습니다");
		}else {
			System.out.println(g+"는 올바른 연료 양이 아닙니다.");
			System.out.println("연료 양을 바꿀 수 없습니다.");
		}
	}
	
	public void show() {
		System.out.println("차량번호는 "+num+"입니다");
		System.out.println("연료 양은 "+gas+"입니다.");
	}
}
