package book.twobook.condition;

import java.util.Scanner;

public class Grade {

	//성적에 따라 학점을 부여
	
	public static void main(String[] args) {
		//성적 입력
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		char grade;
		
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);
	}
}