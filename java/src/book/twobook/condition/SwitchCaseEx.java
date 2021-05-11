package book.twobook.condition;

public class SwitchCaseEx {

	static void switchWithBreak(int time) {
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의합니다.");
			break;
		case 10:
			System.out.println("외근을 갑니다.");
			break;
		default:
			System.out.println("업무를 봅니다.");
			
		}
	}
	
	static void switchWithNoBreak(int time) {
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의합니다.");
		case 10:
			System.out.println("외근을 갑니다.");
		default:
			System.out.println("업무를 봅니다.");
			
		}
	}
	
	public static void main(String[] args) {
		int time = (int) (Math.random()*4)+8;		//8<= ~ <=11 사이의 정수
		
		System.out.println("-----with break-----");
		switchWithBreak(time);
		
		System.out.println();
		System.out.println("-----no break-----");
		switchWithNoBreak(time);
	}
}
