package book.javajs.chap04;

public class EnhancedFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int temp : arr) { 	//배열 혹은 컬렉션만, 배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장.
			System.out.println(temp);
		}
		
		System.out.println("---------------------------");
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		
		for(int i : arr2) {
			sum += i;
		}
		System.out.println(sum);
	}

}
