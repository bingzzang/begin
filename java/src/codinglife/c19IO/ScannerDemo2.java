package codinglife.c19IO;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		System.out.println(i*1000);
		
		sc.close();
	}
}
