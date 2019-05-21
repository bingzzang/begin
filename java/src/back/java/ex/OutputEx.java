package back.java.ex;

import java.util.Scanner;

class OutputEx 
{
	String read ="";
	String input;


	void m1(){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()){
			input = sc.nextLine();
			if(input.isEmpty()){
				break;
			}
			read +=input+"\n";
		}
		
		System.out.println(read);
	}

	public static void main(String[] args) 
	{
		OutputEx op = new OutputEx();
		op.m1();
	}
}
