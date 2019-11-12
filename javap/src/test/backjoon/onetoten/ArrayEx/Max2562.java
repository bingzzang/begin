package test.backjoon.onetoten.ArrayEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max2562 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums[] = new int[9];
		String temp [] = new String[9];
		
		int x =0; 
		int max = 0;
		try {
			for(int i=0;i<temp.length;i++) {
				temp[i] = br.readLine();
				if(Integer.parseInt(temp[i])<100) {
					nums[i] = Integer.parseInt(temp[i]);
				}
			}
			for(int k=0;k<nums.length;k++) {
				for(int j=k+1;j<nums.length;j++) {
					if(nums[k]>nums[j]) {
						x = nums[k];
						nums[k] = nums[j];
						nums[j] = x;
					}
				}
			
			}
			for(int k=0;k<nums.length;k++) {
				if(nums[k]>max) {
					max = nums[k];
				}
			}
			for(int a = 0;a<temp.length;a++) {
				if(Integer.parseInt(temp[a])==nums[8]) {
					System.out.println(nums[8]);
					System.out.println(a+1);
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
