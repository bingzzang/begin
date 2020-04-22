package test.backjoon.onetoten.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SgNald5543 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bmin = 2100;
		int dmin = 2100;
		
		int [] price = new int [5];
		
		for(int i=0; i<price.length;i++) {
			
			int x = Integer.parseInt(br.readLine());
			
			if(x>=100 && x<=2000) {
				price[i] = x;
			}
		}
		
		for(int i=0;i<3;i++) {
			if(price[i]<bmin) {
				bmin = price[i];
			}
			
		}
		
		for(int i=3;i<5;i++) {
			if(price[i]<dmin) {
				dmin = price[i];
			}
		}
		System.out.println(bmin+dmin-50);
		
	}

}
