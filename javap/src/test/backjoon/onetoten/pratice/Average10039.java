package test.backjoon.onetoten.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average10039 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score[] = new int[5];
		
		for(int i=0;i<5;i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x<=100 && x>=0 && x%5==0) {
				score[i] = x;
				if(x<40) {
					score[i] = 40;
				}
			}
		}
		int ws = score[0];	//원섭
		int sh = score[1];	//세희
		int sg = score[2];	//상근
		int si = score[3];	//숭이
		int gs = score[4];	//강수
		
		int avg = (ws+sh+sg+si+gs) /5;
		System.out.println(avg);
	}

}
