package basic.book.vol2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Score {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
			
			int[] test = new int[12];
			String str;
			
			for(int i=0; i<test.length;i++) {
				str = br.readLine();
				test[i] = Integer.parseInt(str);
			}
			
			int max = test[0];
			int min = test[0];
			
			for(int i=0;i<test.length;i++) {
				if(max < test[i])
					max = test[i];
				if(min> test[i])
					min = test[i];
				
				System.out.println(test[i]);
			}
			System.out.println("최고 점수 "+ max);
			System.out.println("최저 점수 "+ min);
			
			br.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
