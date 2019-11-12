package test.backjoon.onetoten.ArrayEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sound2920 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sound[] = new String[2];
		
		sound[0] = "1 2 3 4 5 6 7 8";
		sound[1] = "8 7 6 5 4 3 2 1";
		try {
			String line = br.readLine();
			
			if(line.equals(sound[0])) {
				System.out.println("ascending");
			}else if(line.equals(sound[1])) {
				System.out.println("descending");
			}else {
				System.out.println("mixed");
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
