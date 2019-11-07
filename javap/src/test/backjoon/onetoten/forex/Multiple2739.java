package test.backjoon.onetoten.forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple2739 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int n = Integer.parseInt(line);
		
		if(n>=1 && n<=9) {
			for(int i=1;i<10;i++) {
				System.out.println(n + " * "+i+" = "+(n*i));
			}
		}
		
	}

}
