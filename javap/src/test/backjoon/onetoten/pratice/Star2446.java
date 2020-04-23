package test.backjoon.onetoten.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star2446 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		for(int i=n;i>0;i--) {
			
			if(i==1) continue;
			
			for(int j=n;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
	}

}
