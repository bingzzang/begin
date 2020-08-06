package codinglife.c14;

import java.util.Scanner;

public class Login2 {

	public static void main(String[] args) {
		String id = args[0];
		String pwd = args[1];
		
		if(id.equals("bing")) {
			if(pwd.equals("1234")) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}else {
			System.out.println("wrong");
		}
	}
}
