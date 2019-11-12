package test.backjoon.onetoten.ArrayEx;

import java.util.Scanner;

public class MinMax10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min=1000000;
		int max=-1000000;
		
		int n = sc.nextInt();
		int nums[] = new int[n];
		
		if(n>=1 && n<=1000000) {
			for(int i=0;i<n;i++) {
				nums[i] = sc.nextInt();
			}
			
			for(int j=0;j<nums.length;j++) {
				if(nums[j]>=max) 
					max = nums[j];
			}
			for(int k=0;k<nums.length;k++) {
				if(nums[k]<= min)
					min = nums[k];
			}
			
			System.out.println(min+" "+max);
		}
		
	}
}
