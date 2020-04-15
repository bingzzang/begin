package test.backjoon.onetoten.ArrayEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ox8958 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			int n = Integer.parseInt(br.readLine());
			String lines[] = new String[n];
			int score[] = new int[n];
			
			
			for(int i=0;i<lines.length;i++) {
				lines[i] = br.readLine();
				int count = 0;
				int sum=0;
				for(int j=0;j<lines[i].length();j++) {
					if(lines[i].charAt(j)=='O') {
						count++;
						sum += count;
						score[i] = sum;
					}else{
						count = 0;
					}
				}
			}
			
			for(int z=0;z<score.length;z++) {
				System.out.println(score[z]);
			}
		}catch(IOException e) {
			
		}

	}

}
