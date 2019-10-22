package app.cal;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal {

	ArrayList<Integer> deposit = new ArrayList<>();
	
	int total;
	int init;
	int perweek;
	
	Scanner sc = new Scanner(System.in);

	int input() {
		System.out.print("초기입금액 : ");
		init = sc.nextInt();
		return init;
	}
	/*
	void calculate() {

		for(int i=1;i<27;i++) {
			deposit = i*init;
			total +=deposit;
			
			System.out.println("--- "+ i +"주 ---");
			System.out.println("입금  : " + deposit);
			System.out.println("총액 : "+ total);
		}
	}*/
	
	void calculate2() {
		for (int i = 1;i<27;i++) {
			deposit = new ArrayList<Integer>();
			perweek = i*init;
			deposit.add(perweek);
		}
	}

	public static void main(String[] args) {
		Cal c = new Cal();
		c.input();
		c.calculate2();
	}
	
}
