package codinglife.c19IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		// 파일로부터 입력받기
		
		try {
			File file = new File("./out.txt");
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt());
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
