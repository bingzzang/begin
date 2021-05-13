package book.twobook.iteration;

import java.util.Scanner;

public class MultiplicationTable {
 
	static void basic() {
		for (int i=1; i<=9; i++) {
			System.out.println("--- "+i+"단 ---");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" X "+j + " = "+ (i*j));
			}
			System.out.println();
		}
	}
	
	static void ex1() {
		for (int i=1; i<=9; i++) {
			System.out.println("--- "+i+"단 ---");
			for(int j=1; j<=9; j++) {
				if(j<=i) {
					System.out.println(i+" X "+j + " = "+ (i*j));
					
				}else {
					continue;
				}
			}
			System.out.println();
		}
	}
	
	static void ex2(){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<10;i++) {
			if(i <= num) {
				System.out.println(num+" X " +i+" = "+(num*i));
			}else {
				break;
			}
		}
		
	}
	public static void main(String[] args) {
//		basic();
//		ex1();
		
		
		ex2();
	}
}
