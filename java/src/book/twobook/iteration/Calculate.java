package book.twobook.iteration;

import java.util.Scanner;

public class Calculate {

	static int withIf(char operator, int num1, int num2) {
		int result = 0;
		if(operator == '+') result = num1+num2;
		else if(operator == '-') result = num1-num2;
		else if(operator == '*') result = num1 * num2;
		else result = num1 / num2;
		
		return result;
	}
	
	static int withSwitch(char operator, int num1, int num2) {
		int result = 0;
		
		switch(operator) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		default:
			result = num1 / num2;
		}
		
		return result;
	}
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		char operator = '*';
		
		int result = withIf(operator, num1, num2);

		int result2 = withSwitch(operator, num1, num2);
		System.out.println(result);
		System.out.println(result2);
	}
}
