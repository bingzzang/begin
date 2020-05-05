package test.backjoon.onetoten.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Threenums10817 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		String nums[] = line.split(" ");
		
		int num1, num2, num3;
		
		for(int i=0;i<nums.length;i++) {	// 세 정수 크기 비교
			for(int j=i+1;j<nums.length;j++) {
				if(Integer.parseInt(nums[i])>Integer.parseInt(nums[j])) {
					String temp = nums[i];	//큰 수를 임시 변수에 저장
					nums[i] = nums[j];		//작은수가 배열의 앞으로
					nums[j] = temp;			
				}
			}
		}
		
		num1 = Integer.parseInt(nums[0]);
		num2 = Integer.parseInt(nums[1]);
		num3 = Integer.parseInt(nums[2]);
		
		if(num1>=1 && num1<=100 && num2>=1 && num2<=100 && num3>=1 && num3<=100) {
			System.out.println(num2);
		}
		
	}

}
