package codinglife.c37Exception;

public class Calculator {

	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다.");
		}catch(Exception e) {
			System.out.println("오류 발생 : "+e.getMessage());
		}
		
	}
}
