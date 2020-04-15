package test.backjoon.onetoten.forex;

import java.util.Scanner;

public class SmallNum10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int nums[] = new int[n];
		
		for(int i=0;i<n;i++) {
			nums[i]= sc.nextInt();
		}
		for(int j=0;j<nums.length;j++) {
			if(nums[j]<x) {
				System.out.print(nums[j]+" ");
			}
		}
		
	}

}
