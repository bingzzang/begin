package test.backjoon.onetoten.function;

import java.util.Scanner;

public class Hansu1065 {

	Scanner sc = new Scanner(System.in);
	int n;
	int x;
	
	public int insert(){
		
		x = sc.nextInt();
		if(x > 0 && x <= 1000) {
			return x;
		}else {
			return -1;
		}
	}
	
	public void getHansu() {
		
		
	}
	public static void main(String[] args){
		
		Hansu1065 h = new Hansu1065();
		h.getHansu();
	}

}
