package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

	public static void main(String[] args) throws IOException{ 		//thorws: 예외 처리(다른 방법 try~catch)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("입력하시오");
		System.out.print("> ");
		
		//키보드로 입력한 문자열을 str에 저장
		String str = br.readLine();
		
		System.out.println("---------------------");
		System.out.println(str);
	}

}
