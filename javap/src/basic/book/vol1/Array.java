package basic.book.vol1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void ex1() {
		int [] test; 			//선언
		test = new int[5];		//두 문장으로
		test[0] = 1;
		test[1] = 3;
		test[2] = 5;
		test[3] = 7;
		test[4] = 9;
		
		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[2]);
		System.out.println(test[3]);
		System.out.println(test[4]);
	}
	
	void ex2() {
		int [] scores =new int[5]; //선언 한꺼번에
		try {
			for(int i=0;i<5;i++) {
				int score = Integer.parseInt(br.readLine());
				scores[i] = score;
				
			}
			for(int j=0;j<5;j++) {
				System.out.println((j+1)+"등의 점수는 "+scores[j]+"점 입니다.");
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	void ex3() {
		int[] test = {35,42,2,17,21,9}; //배열 초기화
		
		for(int i=0;i<test.length;i++) {
			System.out.println("test["+i+"] :"+test[i]);
		}
	}
	
	void ex4() {
		int[] test1;
		test1 = new int[3];
		
		System.out.println("test1을 선언");
		System.out.println("배열 요소 생성");
		
		test1[0] = 30;
		test1[1] = 20;
		test1[2] = 40;
		
		int[] test2;
		System.out.println("test2를 선언");
		
		test2 = test1;	//test2에 test1을 대입
		System.out.println("test2에 test1 대입");
		
		
		for(int i=0; i<3; i++) {
			System.out.println(test2[i]);
		}
		System.out.println("----------");
		test2[2] = 100;
		
		for(int i=0;i<3;i++) {
			System.out.println(test2[i]);
		}
	}
	
	void ex5() {
		int[] test = {23,10,29,9,31,12};
		
		for(int i=0;i<6;i++) {
			System.out.println("test["+i+"]: "+test[i]);
		}
		System.out.println("-----------");
		System.out.println(test.length);
	}
	void ex6() throws IOException{
		String fruits[] = new String [7];
				
				for (String fruit : fruits) {
					fruit = br.readLine();
				}
				System.out.println(fruits[3]);
	}
	
	void ex7() throws IOException{
		int[] test = new int[5];
		System.out.println(test.length+"명의 점수 입력");
		for(int i=0;i<test.length;i++) {
			test[i] = Integer.parseInt(br.readLine());
		}
		
		for(int s=0; s<test.length-1;s++) {	//순서대로 정렬
			for(int t=s+1; t<test.length;t++) {
				if(test[t]> test[s]) {
					int temp = test[t];
					test[t] = test[s]; 
					test[s] = temp;
				}
			}
		}
		
		for(int j=0; j<test.length;j++) {
			System.out.println((j+1)+"번째 사람의 점수는"+test[j]+"입니다");
		}
	}
	
	void ex8() {	//다차원 배열
		int[][] test;
		test= new int[2][5];
		
		test[0][0] = 80;
		test[0][1] = 87;
		test[0][2] = 10;
		test[0][3] = 90;
		test[0][4] = 100;
		test[1][0] = 98;
		test[1][1] = 65;
		test[1][2] = 45;
		test[1][3] = 91;
		test[1][4] = 76;
		
		for(int i=0;i<5;i++) {
			System.out.println(test[0][i]);
			System.out.println(test[1][i]);
			System.out.println("-------------");
		}
	}
	void ex9() {
		int[][] test = new int[2][3];
		test[0][0] = 9;
		test[0][1] = 3;
		test[0][2] = 2;
		test[1][0] = 10;
		test[1][1] = 8;
		test[1][2] = 11;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(test[i][j]);
			}
		}
	}
	
	void ex10() {
		int[][] test = {{3,2,0},{9,8,4}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(test[i][j]);
			}
		}
		System.out.println("##");
		System.out.println(test.length);
	}
	void ex11() {
		int[] test = {80,60,22,50,75,100};
		for(int i=0; i<6;i++) {
			System.out.println((i+1)+"번째 사람의 점수는 "+ test[i]+"입니다");
		}
 	}
	
	void ex12() throws IOException{
		System.out.println("5명의 시험 점수를 입력하시오");
		int[] scores = new int[5];
		double avg=0.0;
		int sum =0;
		for(int i=0;i<5;i++) {
			int score = Integer.parseInt(br.readLine());
			scores[i] = score;
			sum += scores[i];
		}
		for(int j=0;j<scores.length;j++) {
			System.out.println((j+1)+"번째 사람의 점수는 "+scores[j]+"입니다.");
		}
		for(int s=0; s<scores.length-1;s++) {	//순서대로 정렬
			for(int t=s+1; t<scores.length;t++) {
				if(scores[t]> scores[s]) {
					int temp = scores[t];
					scores[t] = scores[s]; 
					scores[s] = temp;
				}
			}
		}
		avg = (double)sum/(double)scores.length;
		System.out.println("가장 높은 점수는 "+scores[0]+"입니다.");
		System.out.println("총점 : "+sum +"/ 평균 : "+avg);
	}
	public static void main(String args[]) throws IOException{
		Array ar = new Array();
//		ar.ex1();
//		ar.ex2();
//		ar.ex3();
//		ar.ex4();
//		ar.ex5();
//		ar.ex6();
//		ar.ex7();
//		ar.ex8();
//		ar.ex9();
//		ar.ex10();
//		ar.ex11();
		ar.ex12();
	}
}
