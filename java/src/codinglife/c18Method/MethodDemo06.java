package codinglife.c18Method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodDemo06 {

	public static String numbering(int init, int limit) {
		int i=init;
		
		String output = "";
		
		while(i<limit) {
			output += i;
			i++;
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {
		String result  = numbering(1,10);
		
		System.out.println(result);
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt")); 		//프로젝트 root 폴더에 저장
			out.write(result);
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
