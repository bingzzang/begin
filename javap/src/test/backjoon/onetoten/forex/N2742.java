package test.backjoon.onetoten.forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2742 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			if(n>=1 && n<=100000) {
				for(int i=n;i>=1;i--) {
					System.out.println(i);
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
