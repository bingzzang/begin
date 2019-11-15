package test.backjoon.onetoten.ArrayEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average4344 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int c= Integer.parseInt(br.readLine());
			String lines []= new String[c];
			
			for(int i=0;i<c;i++) {
				lines[i] = br.readLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
