package basic.book.vol2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("파일에 기록된 2개의 문자열");
			System.out.println("첫번째 - "+str1);
			System.out.println("두번째 - "+str2);
			
			br.close();
		} catch (IOException e) {
			System.out.println("에러##");
		}

	}

}
