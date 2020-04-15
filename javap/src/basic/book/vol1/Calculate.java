package basic.book.vol1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int total;
	
	int twentySix() throws IOException{
		int money = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=26;i++) {
			total += money*i;
		}
		return total;
	}
	
	void show() throws IOException {
		twentySix();
		System.out.println(total);
	}
	public static void main(String[] args) throws IOException{
		Calculate m2 = new Calculate();
//		m2.twentySix();
		m2.show();
	}

}
