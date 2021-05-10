package book.twobook.operator;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double var1 = sc.nextDouble();
		
		double var2 = sc.nextDouble();
		
		System.out.print("첫 번째 수 : "+var1+"\n");
		System.out.print("두 번째 수 : "+var2+"\n");
		System.out.println("--------------------");
		
		
		if(var2==0.0 || var2 ==0) {
			System.out.print("결과 : 무한대");
		}else {
			System.out.println("결과 : "+(var1/var2));
		}
		
	}
}
