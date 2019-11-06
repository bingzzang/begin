package test.backjoon.one.inputoutput;

import java.io.*;

public class Multiple2588 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num1 = br.readLine();
		String num2 = br.readLine();
		
		int a = Integer.parseInt(num1);
		int a1 = Integer.parseInt(num2.substring(2));
		int a2 = Integer.parseInt(num2.substring(1,2));
		int a3 = Integer.parseInt(num2.substring(0,1));
		
		int b1 = a*a1;
		int b2 = a*a2;
		int b3 = a*a3;
		
	//	System.out.println(num1);
	//	System.out.println(num2);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		int answer = b1+(b2*10)+(b3*100);
		System.out.println(answer);
	}

}
