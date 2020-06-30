package book.javajs.chap05;

import java.util.Scanner;

public class BattleShip {
	
	//좌표에 X표하기
	
	public static void main(String[] args) {
		final int SIZE = 10;
		
		int x = 0;
		int y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
			//   1	2  3  4  5  6  7  8  9
				{0, 0, 0, 0, 0, 0, 1, 0, 0}, //1
				{1, 1, 1, 1, 0, 0, 1, 0, 0}, //2
				{0, 0, 0, 0, 0, 0, 1, 0, 0}, //3
				{0, 0, 0, 0, 0, 0, 1, 0, 0}, //4
				{0, 0, 0, 0, 0, 0, 0, 0, 0}, //5
				{1, 1, 0, 1, 0, 0, 0, 0, 0}, //6
				{0, 0, 0, 1, 0, 0, 0, 0, 0}, //7
				{0, 0, 0, 1, 0, 0, 0, 0, 0}, //8
				{0, 0, 0, 0, 0, 1, 1, 1, 0}, //9
		};
		
		//1행에 행번호, 1열에 열번호 저장
		for(int i=1;i<SIZE;i++) {
			board[0][i] = board[i][0] = (char)(i+'0');
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("좌표 입력(종료는 00)");
			System.out.print("> ");
			String input = sc.nextLine();
			
			if(input.length() == 2) {
				x = input.charAt(0) - '0'; //문자를 숫자로 변환. 아스키코드를 알 필요 없이 바로 숫자로 변환 가능
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0) break;
			}
			
			if(input.length() !=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
				System.out.println("잘못된 입력");
				continue;
			}
			
			//shipBoard[x-1][y-1]의 값이 1이면, '0'을 board[x][y]에 저장한다.
			board[x][y] = shipBoard[x-1][y-1] ==1 ? 'O' : 'X';
			
			// 배열 board의 내용을 화면에 출력한다.
			for(int i=0; i<SIZE;i++) {
				System.out.println(board[i]); 
			}
			
			System.out.println();
		}	
	}
}
