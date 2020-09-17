package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Choose {
	
	ArrayList<String> countries = new ArrayList<String>();

	Choose(){
		readFile();
		System.out.println("Start? (Y or N)");
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String ans = br.readLine();
			
			if("Y".equalsIgnoreCase(ans)) {
				execute();
			}else {
				System.out.println("the end");
			}
		}catch(IOException ie) {
			ie.getStackTrace();
		}
	}
	
	void readFile() {
		try {
			//파일 객체 생성
			File file = new File("resources\\country.txt");
			//입력 스트림 생성
			FileReader fr = new FileReader(file);
			//입력버퍼 생성
			BufferedReader bufReader = new BufferedReader(fr);
			
			String line = "";
			
			while((line = bufReader.readLine()) != null) {
				countries.add(line);
			}
			
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException ie) {
			ie.getStackTrace();
		}
	}
	
	void execute() {
		//collections.shuffle 이용
		/*
		Collections.shuffle(countries);
		String pick = countries.get(0);
		System.out.println(pick);
		*/
		
		//Math.random 이용
		double ranVal = Math.random();
		
		int count = (int)(ranVal * countries.size()) -1;
		
		String pick = countries.get(count);
		System.out.println(pick);
	}
	
	public static void main(String[] args) {
	
		Choose c = new Choose();
	}
}
