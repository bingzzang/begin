package book.java.chap11;

public class MathRandomEx {

	void lotto() {
		
		//System.out.print(num+" ");
		for(int i = 0;i<7;i++) {
			int num = (int)(Math.random()*45)+1;
			if(i==6) {
				System.out.println("보너스 : "+num);
			}else {
				System.out.print(num+" ");
			}
		}
	}
	
	void dice() {
		int num = (int)(Math.random()*6)+1;
		System.out.println("주사위 : "+num);
	}
	public static void main(String[] args) {
		MathRandomEx me = new MathRandomEx();
		me.lotto();
		me.dice();
	}

}
