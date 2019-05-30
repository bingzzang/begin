package book.java.chap11;

import java.util.Arrays;

public class ArrayEx {

	void arrayCopyEx() {
		char[] arr1 = {'J','A','V','A'};
		
		//1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); //arr1 전체를 arr2로 복사
		System.out.println(Arrays.toString(arr2));
		
		//2
		char[] arr3 = Arrays.copyOfRange(arr1, 1,3); //arr[1]~arr[2]를 복사
		System.out.println(Arrays.toString(arr3));
		
		//3 
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length); 	//arr1 전체를 arr4로 복사
		for(int i =0; i<arr4.length;i++) {
			System.out.println("arr4["+i+"] = "+arr4[i]);
		}
	}
	public static void main(String[] args) {
		ArrayEx ae = new ArrayEx();
		ae.arrayCopyEx();

	}

}
