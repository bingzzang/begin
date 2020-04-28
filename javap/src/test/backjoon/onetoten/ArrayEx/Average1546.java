package test.backjoon.onetoten.ArrayEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average1546 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//과목수
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int subs[] = new int[n];
		
		int max = 0 ;
		
		for(int i=0;i<subs.length;i++) {
			subs[i] = Integer.parseInt(st.nextToken());
			if(subs[i]> max) max = subs[i];
		}
		double subs2[] = new double[n];
		
		double sum = 0.0;
		for(int i=0;i<subs.length;i++) {
			subs2[i] = (double)subs[i]/(double)max *(double) 100;
			sum +=subs2[i];
		}
		double avg = sum/(double) n;
		System.out.println(avg);
	}

}
