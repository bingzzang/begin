package codinglife.c14;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String id;
		
//		Scanner sc = new Scanner(System.in);
		
		id = args[0];
		
//		System.out.print("id> ");
//		id = sc.nextLine();
		
		if(id.equals("bing")) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}
}
