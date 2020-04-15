package test.backjoon.onetoten.inputoutput;

import java.io.*;

public class Remainder10430 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/*
		int idx = str.indexOf(" ");
		int lastidx = str.lastIndexOf(" ");

		int a = Integer.parseInt(str.substring(0,idx));
		int b = Integer.parseInt(str.substring(idx+1,lastidx));
		int c = Integer.parseInt(str.substring(lastidx+1));
		*/
		
		String[] lines = str.split(" ");
		int a = Integer.parseInt(lines[0]);
		int b = Integer.parseInt(lines[1]);
		int c = Integer.parseInt(lines[2]);
		
		if(a>=2 && c<=10000) {
			System.out.println((a+b)%c);
			System.out.println((a%c+b%c)%c);
			System.out.println((a*b)%c);
			System.out.println((a%c*b%c)%c);
		}
	}
}
