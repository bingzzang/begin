package test.backjoon.onetoten.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star10996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int row = 0;
		
		if(n==1) {
			row = n;
		}else if(n>=2 && n<=100) {
			row = 2 * n;
		}
		
		//전체 줄
		for(int i=1; i<=row;i++) {
			//홀수 행
			if(i%2==1) {
				for(int k=1; k<=n;k++) {
					if(k % 2 == 1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			//짝수 행
			}else {	
				for(int k=1; k<=n;k++) {
					if(k % 2 == 1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}				
				}
			}
			System.out.println();
		}
	}

}
