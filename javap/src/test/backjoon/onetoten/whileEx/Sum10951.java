package test.backjoon.onetoten.whileEx;

import java.util.Scanner;

public class Sum10951 {

	// EOF 처리
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}
