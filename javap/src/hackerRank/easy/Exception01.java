package hackerRank.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int result = x/y;
			
			System.out.println(result);
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch(ArithmeticException ae) {
			System.out.println(ae);
		} 
		
	}
}
