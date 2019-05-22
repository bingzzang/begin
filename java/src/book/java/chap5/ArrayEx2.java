package book.java.chap5;

class ArrayEx2 
{
	//배열의 항목에서 최대값 구하기
	//for문 이용

	void m1(){
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i<array.length; i++){
			if (max<array[i]){
				//max의 값보다 array[i]이 크면 max = array[i]
				max = array[i];
			}
		}
		System.out.println("max : " + max);
	}

	public static void main(String[] args) 
	{
		ArrayEx2 ae = new ArrayEx2();
		ae.m1();
	}
}