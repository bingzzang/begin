package test.backjoon.onetoten.inputoutput;

import java.io.*;

public class Calculations10869 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int idx = str.indexOf(" ");
		int a = Integer.parseInt(str.substring(0, idx));
		int b = Integer.parseInt(str.substring(idx+1));
		
		if(a>=1 && b<=10000) {
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		}
	}

}
