package java200.One;

import java.util.Scanner;

public class InOutMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	//키보드
		
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();		//키보드로 정수 입력
		System.out.println(n);
		
		System.out.println("실수를 입력하세요");
		double d = sc.nextDouble();
		System.out.println(d);
		
		System.out.println("문자를 입력하세요");
		String str = sc.next();
		System.out.println(str);
	}

}
/*
 * 간단한 데이터를 입력 받을 때는 scanner
 * 대량의 데이터를 다룰 때는 io
 */