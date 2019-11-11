package test.backjoon.onetoten.forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum8393 {
	/*
	 * 1부터 n까지의 합
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		if(n>=1 && n<=10000) {
			for(int i=1;i<=n;i++) {
				sum += i;
			}
			
			System.out.println(sum);
		}
		

	}

}
