package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operator {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void ex1() {
		int a = 0;
		int b = 0;
		System.out.println("a : "+ a);
		System.out.println("-------------");
		
		b = a++; 	//++는 대입 후에 1 증가
		
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		
	}
	
	void ex2() {
		int a = 0;
		int b = 0;
		
		System.out.println("a : "+ a);
		System.out.println("-------------");
	
		b = ++a;
		
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
	}
	
	void ex3() {
		System.out.println("1+2는 "+1+2+"입니다");
		System.out.println("1+2는 "+(1+2)+"입니다");
	}
	
	void ex4() {
		System.out.println("정사각형의 한 변의 길이를 입력하세요");
		System.out.print("> ");
		
		try {
			String str = br.readLine();
			int a = Integer.parseInt(str);
			System.out.println("정사각형의 넓이는 "+(a*a)+"입니다");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	void ex5(){
		System.out.println("삼각형의 밑변과 높이를 입력하세요");
		try {
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			int bottom = Integer.parseInt(str1);
			int height = Integer.parseInt(str2);
			
			double area = ((double)bottom*(double)height)/2;
			
			System.out.println("삼각형의 널이 : "+area);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void ex6() {
		int[] sub = new int[5];  
		double sum = 0.0;
		double avg = 0.0;
		System.out.println("점수를 입력하세요");
		
		for(int i=0;i<5;i++) {
			try {
				String str = br.readLine();
				int score = Integer.parseInt(str);
				sub[i]= score;
				sum +=sub[i];
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		avg = sum/sub.length;
		
		System.out.println("점수 : "+sub[0]+", "+sub[1]+", "+sub[2]+", "+sub[3]+", "+sub[4]);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}
	public static void main(String[] args) {
		Operator op = new Operator();
//		op.ex1();
//		op.ex2();
//		op.ex3();
//		op.ex4();
//		op.ex5();
		op.ex6();
	}

}
