package test.backjoon.onetoten.forex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sum15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		if(t<=1000000) {
			for(int i=0; i<t;i++) {
				String [] nums = br.readLine().split(" ");
				bw.write(Integer.parseInt(nums[0])+Integer.parseInt(nums[1])+"\n");
			}
			bw.flush();
			bw.close();
		}
		
	}

}
