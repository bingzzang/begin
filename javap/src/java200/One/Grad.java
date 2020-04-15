package java200.One;

public class Grad {

	public static void main(String[] args) {
		int kor = 98;
		int eng = 95;
		int math = 100;
		
		int total = kor+eng+math;	//293
		
		int average = total/3;		// 97.6666667 소수점은 반환하지 않는다. 몫만 나옴 (int)
		
		System.out.printf("국어 %d점, 영어 %d점, 수학%d점 \n", kor, eng, math);
		System.out.printf("총점 %d점, 평균 %d점", total, average);

	}

}
