package test.backjoon.onetoten.function;

import java.util.ArrayList;

public class SelfNum4673 {
	ArrayList<Integer> list = new ArrayList<>();
	
	int get(int n) {
		int num =n;
		
		while(n>0) {
			num = num +(n%10);
			n= n/10;
		}
		return num;
		
	}
	
	void real() {
		for(int i=1;i<=10000;i++) {
			list.add(get(i));
		}
		
		for(int i=1;i<=10000;i++) {
			if(list.contains(i)==false) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		SelfNum4673 sn = new SelfNum4673();
		sn.real();
	}

}
