package test.backjoon.onetoten.forex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sum11021 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i=0;i<t;i++) {
				String nums[] = br.readLine().split(" ");
				int a = Integer.parseInt(nums[0]);
				int b = Integer.parseInt(nums[1]);
				bw.write("Case #"+(i+1)+": ");
				bw.write(Integer.parseInt(nums[0])+Integer.parseInt(nums[1])+"\n");
				bw.flush();
			}
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
