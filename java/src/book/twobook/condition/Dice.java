package book.twobook.condition;

public class Dice {

	/*
	 * 주사위를 굴려서 나올 수 있는 1,2,3,4,5,6 중에서
	 * 하나의 수를 무작위로 뽑아서 출력
	 * 
	 * */
	
	static int getNumber() {
		//임의의 정수 뽑기
		// 0.0 <= Math.random() < 1.0
		
		int num = (int)(Math.random()*6)+1;
		
//		System.out.println(num);
		
		return num;
	}
	
	static void getIfEx(int diceNum) {
		if(diceNum == 1) {
			System.out.println("1번!!");
		}else if(diceNum ==2) {
			System.out.println("2번!!");
		}else if(diceNum == 3) {
			System.out.println("3번!!");
		}else if(diceNum == 4) {
			System.out.println("4번!!");
		}else if(diceNum == 5) {
			System.out.println("5번!!");
		}else {
			System.out.println("6번!!");
		}
	}
	
	static void getSwitchEx(int diceNum) {
		
		switch(diceNum) {
			case 1:
				System.out.println("1번!!");
				break;
			case 2:
				System.out.println("2번!!");
				break;
			case 3:
				System.out.println("3번!!");
				break;
			case 4:
				System.out.println("4번!!");
				break;
			case 5:
				System.out.println("5번!!");	
				break;
			default:
				System.out.println("6번!!");
		}
	}
	public static void main(String[] args) {
		
		int diceNum = getNumber();
		
//		getIfEx(diceNum);
		
		getSwitchEx(diceNum);
	}
}
