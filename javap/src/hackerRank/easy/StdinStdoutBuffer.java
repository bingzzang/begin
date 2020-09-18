package hackerRank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdinStdoutBuffer {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] nums = new int [3];
		
		try {
			for(int i=0; i<nums.length;i++) {
				nums[i] = Integer.parseInt(br.readLine());
			}
			
			for(int k=0; k<nums.length;k++) {
				System.out.println(nums[k]);
			}
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

}
