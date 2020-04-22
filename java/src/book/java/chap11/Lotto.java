package book.java.chap11;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	
	public static void main(String[] args) {
		int[] selectNum = new int[6];
		Random r = new Random();
		System.out.print("선택번호 : ");
		for (int i = 0; i<6; i++) {
			selectNum[i] = r.nextInt(45)+1;
			System.out.print(selectNum[i]+" ");
		}
		
		System.out.println(" ");
		 
		int[] winNum = new int[6];
		r = new Random();
		System.out.print("당첨번호 : ");
		for (int i = 0; i<6; i++) {
			winNum[i] = r.nextInt(45)+1;
			System.out.print(winNum[i]+" ");
		}
		
		System.out.println(" ");
		
		
		
		Arrays.sort(winNum);
		
		boolean result = Arrays.equals(selectNum,winNum);
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("당첨되셨습니다");
		}else {
			System.out.println("당첨되지 않으셨습니다");
		}
	}

}
