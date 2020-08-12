package codinglife.c27Overriding;

public class SubtractionableCalculator extends Calculator{

	public void sum() {
		System.out.println("실행결과 : "+(this.left+this.right));
	}
	
	public void subtract(){
		System.out.println(this.left - this.right);
	}
}
