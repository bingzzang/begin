package basic;

import java.io.*;

public class IdentifierEx{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void ex1() throws IOException{
		System.out.println("당신은 몇 살입니까?");
		String str = br.readLine();
		int age = Integer.parseInt(str);
		System.out.println("저는 "+age+"살 입니다");
		
	}
	
	void ex2() throws IOException{
		System.out.println("원주율의 값은 얼마입니까?");
		
		String str = br.readLine();
		
		double pi = Double.parseDouble(str);
		
		System.out.println("원주율 : "+ pi);
	}
	
	void ex3() throws IOException{
		System.out.println("키와 몸무게를 입력 하시오");
		System.out.print("키 : ");
		String str = br.readLine();
		System.out.print("몸무게 : ");
		String str2 = br.readLine();
		
		double height = Double.parseDouble(str);
		double weight = Double.parseDouble(str2);
		
		System.out.println("키 : "+height);
		System.out.println("몸무게  : "+weight);
	}
	public static void main(String[] args) throws IOException{
		IdentifierEx id = new IdentifierEx();
//		id.ex1();
//		id.ex2();
		id.ex3();
	}

}
