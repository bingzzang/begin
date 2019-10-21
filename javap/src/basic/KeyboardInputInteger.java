package basic;

import java.io.*;

public class KeyboardInputInteger {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("정수를 입력하시오");
		System.out.print("> ");
		
		String str = br.readLine();
		System.out.print("> ");
		String str2 = br.readLine();	//두 번 연속으로 숫자를 입력
		
		int num = Integer.parseInt(str);	//문자열을 변환하여 int 형의 변수에 저장
		int num2 = Integer.parseInt(str2);
		
		System.out.println("----------------------");
		System.out.println("num : "+num);
		System.out.println("num2 : "+num2);
	}
}
