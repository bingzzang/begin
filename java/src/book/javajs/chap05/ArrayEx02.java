package book.javajs.chap05;

public class ArrayEx02 {

	//배열의 복사
	
	void ex1() {
		int[] arr = {1,2,3,4,5};
		
		int[] temp = new int[arr.length*2]; //arr의 길이 2배인 배열 생성
		
		for(int i=0; i<arr.length;i++) {
			temp[i] = arr[i];		//arr배열 값을 temp에 저장
		}
		
		arr=temp; 		//참조변수 arr이 새로운 배열을 가리키게 함
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}

	}
	
	void ex2() {
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 하나의 배열로 만든다
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		//배열복사. System.arraycpy(복사할배열a, a인덱스, 결과배열b, 저장될b인덱스, n개의 데이터) 복사 
		
		System.out.println(result);
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		ArrayEx02 ae = new ArrayEx02();
//		ae.ex1();
		ae.ex2();
	}

}
