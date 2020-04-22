package lecture.java.sec02;

import java.util.Arrays;

public class Array02 {
	public static void main(String[] args) {
		int [] arr1 = {10, 20, 30, 40, 50};
		int [] arr2 = null;
		int [] arr3 = null;
		
		//배열 길이
		System.out.println("arr1.length : " + arr1.length);
		
		//배열 복사
		arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr3 : "+ Arrays.toString(arr3));
	}
}
