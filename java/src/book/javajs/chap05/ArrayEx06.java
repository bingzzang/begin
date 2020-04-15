package book.javajs.chap05;

public class ArrayEx06 {

	public static void main(String[] args) {
		int [][] score = {{100,100,100}
						, {20, 20, 20}
						, {30, 30, 30}
						, {40, 40, 40}
						, {50, 50, 50}};
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("============================================");
		
		for(int i=0; i<score.length;i++) {
			int sum = 0;
			float avg = 0.0f;
			
			kor += score[i][0];
			eng += score[i][1];
			math += score[i][2];
			System.out.printf( "%3d\t", i+1);
			
			for(int j=0;j<score[i].length;j++) {
				sum +=score[i][j];
				System.out.printf("%5d\t", score[i][j]);
			}
			
			avg = sum / (float)score[i].length;
			System.out.printf("%5d\t %5.1f%n", sum, avg);
			
		}
		System.out.println("============================================");
		System.out.printf("총점:\t %3d\t %4d\t %4d%n", kor, eng,math);
	}

}
