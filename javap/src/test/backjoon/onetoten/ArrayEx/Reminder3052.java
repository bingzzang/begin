package test.backjoon.onetoten.ArrayEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Reminder3052 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int nums[] = new int[10];
	int count = 1;
	
	void ex() {
		try {
			for(int i=0;i<nums.length;i++) {
				int x = Integer.parseInt(br.readLine());
				nums[i] = x % 42;
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		Arrays.sort(nums);
		for(int k=0;k<9;k++) {
			if(nums[k]!=nums[k+1]) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		Reminder3052 r = new Reminder3052();
		r.ex();
	}

}
