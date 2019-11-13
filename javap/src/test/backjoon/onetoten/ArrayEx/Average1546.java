package test.backjoon.onetoten.ArrayEx;

import java.util.Scanner;

public class Average1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//시험 본 과목의 개수
		int score[] = new int[n];	//점수를 담을 배열
		int max = 0;
		double newscore[] = new double[n];
		double avg= 0;
		int sum = 0;
		
		if(n>=0 && n<=1000) {
			for(int i=0;i<score.length;i++) {
				score[i] = sc.nextInt();
			}
		}	
			for(int k=0;k<score.length;k++) {
				if(score[k]>=0 && score[k]<=100) {
					if(score[k]>max) {
						max = score[k];
					}	
				}
			}
			for(int m=0;m<score.length;m++) {
				newscore[m] = ((double)score[m]/(double)max)*100;
			}
			
			for(int a=0;a<newscore.length;a++) {
				sum += newscore[a];
			}
			avg = (double)sum/(double)n;
			System.out.println(avg);
		
	}

}
