package book.java.chap5;

class ArraySumAvg 
{

	// 배열 전체 항목의 합과 평균값
	// 중첩 for문

	void m1(){
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};

		int sum = 0;
		double avg = 0.0;
		int x = 0;

		for (int i = 0 ; i<array.length; i++){
			x+=array[i].length;
			for (int k=0; k<array[i].length ;k++ ){
				sum +=array[i][k];
		//		x++;
			}
		}	
		avg = sum/x;
	
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

	public static void main(String[] args) 
	{
		ArraySumAvg asa = new ArraySumAvg();
		asa.m1();
	}
}