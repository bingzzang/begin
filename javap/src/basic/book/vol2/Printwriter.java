package basic.book.vol2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));
			/*
			 * FileWriter : 파일에 기록하기 위한 문자 스트림
			 * BufferedWriter : 버퍼를 경유해서 기록하기 위한 문자 스트림
			 * PrintWriter : 한 줄씩 기록하기 위한 문자 스트림
			 * */
			pw.println("Hello");
			pw.println("GoodBye");
			
			System.out.println("파일에 기록되었습니다");
			
			pw.close();
		} catch (IOException e) {
			System.out.println("## 입출력에러 ##");
		}

	}

}
