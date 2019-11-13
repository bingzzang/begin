package test.backjoon.onetoten.ArrayEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reminder3052 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums[] = new int[10];	//입력받은 숫자
		int x;						//나머지 구하는 식
		int re[] = new int[10];		//나머지
		int count = 0;				//같은거 개수
		
		try {
		
			for(int j=0;j<nums.length;j++) {
				if(nums[j]>=0 && nums[j]<=1000) 
					nums[j] = Integer.parseInt(br.readLine());
			}
			for(int k=0;k<nums.length;k++) {
				x = nums[k] % 42;
				re[k] = x;
			}
			for(int a=0;a<re.length;a++) {
				System.out.println(re[a]);
				for(int b=a+1;b<re.length;b++) {
					if(re[a]==re[b]) {
						count++;
					}
				}
			}
			System.out.println(re.length-count);
		} catch (IOException e) {
		
		}
	}

}
