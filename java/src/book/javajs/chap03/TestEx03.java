package book.javajs.chap03;

public class TestEx03 {
	//수의 값에 따라 양수 음수 0을 출력하는 코드
	
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(num >0 ? (num==0 ? 0 : "양수") : "음수");
		//(num> 0 ? "양수":(num < 0 ?"음수":"0")
	}
}
