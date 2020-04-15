package basic.book.vol2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MathEx {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void ex1() {
		try {
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			int ans = Math.max(num1, num2);
			
			System.out.println(num1+"/"+num2+"중에 큰 값 : "+ans);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	void ex2() {
		int ran = (int)(Math.random()*6)+1;
		System.out.println(ran);
		
		double ran2 = Math.random()*10;
		System.out.println(ran2);
		
		int ran3 = (int)(Math.random()*46)+1;
		System.out.println(ran3);
	}
	
	void ex3() {
		int[] nums = new int[7];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = (int)(Math.random()*46)+1;
			if(i>=0 && i<=5)
			System.out.print(nums[i]+"\t");
		} System.out.println("bonus: "+nums[6]);
	}
	public static void main(String[] args) {
		MathEx me = new MathEx();
//		me.ex1();
//		me.ex2();
		me.ex3();
	}

}
