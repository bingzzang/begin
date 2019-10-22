package basic.book.vol1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void ex1() {
		for(int i=1; i<6;i++) {
			System.out.println(i+"번");
		}
		System.out.println("끝");
	}
	
	void ex2() {
		int i;
		for(i=1;i<6;i++) {
			System.out.println(i+"번");
		}
		System.out.println("--------");
		System.out.println((i-1)+"번 실행");
	}
	
	void ex3() {
		try {
			System.out.println("몇까지의 합을 구하실?");
			
			int num = Integer.parseInt(br.readLine());
			int sum = 0;
			
			for(int i=1; i<=num;i++) {
				sum +=i;
			}
			System.out.println("총 합 : "+ sum);
		} catch (IOException e) {
			System.out.println("### "+e);
		}
	}
	
	void ex4() {
		int i = 1;
		while (i<=10) {//조건이 참인 경우
			System.out.println(i+"번째 반복");
			i++;		//조건이 거짓(false)에 가까워지도록 증가 연산자를 이용해 1씩 더하기
		}
		System.out.println("끝");
	}
	
	void ex5() {
		int i = 1;
		do {
			System.out.println(i);
			i++;					//먼저 한 번 do 안에 있는 문장이 실행된 후 조건을 따짐
		}while(i<=10);
		System.out.println("끝");
	}
	
	void ex6() {
		for(int i = 0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.println(i + ", "+j);
			}
		}
		System.out.println("끝");
	}
	
	void ex7() {
		boolean bl = false;
		for(int i=0;i<10; i++) {
			for(int j=0;j<i;j++) {
				if(bl==false) {
					System.out.print("*");
					bl=true;
				}else {
					System.out.print("-");
					bl=false;
				}
			}
			System.out.println("\n");
		}
	}
	void ex8() {
		System.out.println("어디서 빠져나가실?");
		try {
			int num = Integer.parseInt(br.readLine());
			for(int i=1;i<=10;i++) {
				
				if(i==num){
					System.out.println("끝");
					break;
				}
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	void ex9() {
		System.out.println("어디서 건너뛰실?");
		try {
			int num = Integer.parseInt(br.readLine());
			for(int i=1;i<=10;i++) {
				
				if(i==num){
					System.out.println("통과");
					continue;
				}
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	void ex10(){
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	void ex11() {
		System.out.println("시험 점수 입력");
		int score=0;
		int sum=0;
		for(int i=1;i<=100;i++) {
			try {
				score=Integer.parseInt(br.readLine());
				sum+=score;
				if(score==0) {	//0이면 끝나게
					break;
				}
			} catch (IOException e) {
				// TODO: handle exception
			}
			
		}
		System.out.println(sum);
	}
	void ex12() {	//소수 판정
		try {
			int num = Integer.parseInt(br.readLine());
			int x = 2;
			int y = num-1;
			while(true) {
				if(x<=y) {
					if(num%x==0) {
						System.out.println("소수 아님");
						break;
					}else {
						x++;
					}
				}else {
					System.out.println("소수 : "+num);
					break;
				}
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static void main(String[] args) {
		Loop lp = new Loop();
//		lp.ex1();
//		lp.ex2();
//		lp.ex3();
//		lp.ex4();
//		lp.ex5();
//		lp.ex6();
//		lp.ex7();
//		lp.ex8();
//		lp.ex9();
//		lp.ex10();
//		lp.ex11();
		lp.ex12();
	}

}
