package app.test;

import java.io.*;

public class Lotto {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str;
	int[] num = new int[6];
	
	void input() {
		try {
			System.out.println("로또 번호를 생성하시겠습니까? (Y/N)");
			
			str = br.readLine();
			
			if("Y".equals(str)) {
				for(int i=0;i<6;i++) {
					num[i] = (int)(Math.random()*45)+1;
					System.out.print(" "+num[i]);
					
				}
				
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Lotto lo = new Lotto();
		lo.input();

	}

}
