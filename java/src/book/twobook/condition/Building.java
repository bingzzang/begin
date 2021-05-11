package book.twobook.condition;

import java.util.Scanner;

public class Building {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 층? (1-5)");
		int floor = sc.nextInt();
		
		if (floor<=0 || floor>5) {
			floor = sc.nextInt();
		}
		
		String place;
		
		switch(floor) {
		case 1:
			place = "약국";
			break;
		case 2:
			place = "정형외과";
			break;
		case 3:
			place = "피부과";
			break;
		case 4:
			place = "치과";
			break;
		default :
			place = "헬스 클럽";
				
		}
		
		System.out.println(floor+"층 "+place);
	}
}
