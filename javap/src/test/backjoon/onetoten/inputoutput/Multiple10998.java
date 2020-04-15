package test.backjoon.onetoten.inputoutput;

import java.io.*;

public class Multiple10998 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		String str;
		int ans;
		
		str = br.readLine();
		int idx = str.indexOf(" ");
		
		a = Integer.parseInt(str.substring(0, idx));
		b = Integer.parseInt(str.substring(idx+1));
		
		ans = a*b;
		System.out.println(ans);
	}

}
