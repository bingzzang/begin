package test.backjoon.onetoten.ArrayEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count2577 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count[] = new int[10];
		
		try {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			
			int tot = a*b*c;
//			System.out.println(tot);
			
			while(tot>0) {
				count[tot % 10]++;
				tot /= 10;
			}
			
			for(int i=0;i<count.length;++i) {
				System.out.println(count[i]);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		
		
	}

}
