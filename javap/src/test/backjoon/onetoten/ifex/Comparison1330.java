package test.backjoon.onetoten.ifex;

import java.util.*;

public class Comparison1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		int idx = line.indexOf(" ");
		
		int num1 = Integer.parseInt(line.substring(0,idx));
		int num2 = Integer.parseInt(line.substring(idx+1));
		
		if(num1<num2) {
			System.out.println("<");
		}else if(num1>num2) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}

	}

}
