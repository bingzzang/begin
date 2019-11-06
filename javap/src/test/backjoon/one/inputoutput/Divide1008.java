package test.backjoon.one.inputoutput;

import java.io.*;

public class Divide1008 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int idx = str.indexOf(" ");
		int a = Integer.parseInt(str.substring(0, idx));
		int b = Integer.parseInt(str.substring(idx+1));
		if(0<a && b<10) {
			double ans = (double)a/(double)b;
			System.out.println(ans);
		}
	}

}
