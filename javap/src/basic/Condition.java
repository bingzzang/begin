package basic;

import java.io.*;

public class Condition {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void ex1() {
		System.out.println("정수를 입력하세요");
		try {
			String str = br.readLine();
			int num = Integer.parseInt(str);
			
			if(num ==1) {
				System.out.println("no.1");
			} else {
				System.out.println("Normal");
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	
	void ex2() {
		int[] score = new int[5];
		int sum = 0;
		int avg = 0;
		try {
			System.out.println("점수를 입력하세요");
			for(int i=0;i<5;i++) {
				score[i] = Integer.parseInt(br.readLine());
				sum += (double)score[i];
			}
			avg = sum/score.length;
			System.out.println("총점 : "+sum);
			System.out.println("평점 : "+avg);
			switch (avg) {
			case 90:
				System.out.println("A");
				break;
			case 80:
				System.out.println("B");
				break;
			case 70:
				System.out.println("C");
				break;
			case 60:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	void ex3() {
		System.out.println("성별 입력(F : 여/M : 남)");
		
		try {
			String str = br.readLine();
			if("f".equalsIgnoreCase(str)) {
				System.out.println("505");
			}else {
				System.out.println("202");
			}
			
			System.out.println("다시 입력하겠습니까?(y/n)");
			str = br.readLine();
			char res = str.charAt(0);
			
			if(res == 'y' || res =='Y') {
				ex3();
			}else {
				System.out.println("종료합니다");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	void ex4() throws IOException{
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res ==1)? 'A':'B';
		System.out.println(ans+"코스");
	}
	
	void ex5() {
		try {
			System.out.println("1부터 10까지의 수를 입력하시오");
			int num = Integer.parseInt(br.readLine());
			if(0<num && num<11) {
				System.out.println("GREAT");
			}else {
				System.out.println("다시 입력하시오");
				ex5();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	void ex6() throws IOException{
		System.out.println("점수를 입력하세요");
		int score = Integer.parseInt(br.readLine());
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
	public static void main(String[] args) throws IOException {
		Condition c = new Condition();
//		c.ex1();
//		c.ex2();
//		c.ex3();
//		c.ex4();
//		c.ex5();
		c.ex6();
	}

}
