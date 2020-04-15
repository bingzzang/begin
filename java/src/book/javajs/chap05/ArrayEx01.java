package book.javajs.chap05;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));	//배열 출력
		System.out.println(arr); 	
		
		char[] charr = {'a','b','c'};
		System.out.println(charr); //예외적으로 구분자 없이 abc 출력
	}
}
