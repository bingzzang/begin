package java200.One;

public class Grade {
	//정수 배열
	public static void main(String[] args) {
		int [] grade = {93, 80, 79};	//초기화 자동으로 grade[0],grade[1],grade[2]에 저장됨
		int tot = grade[0]+grade[1]+grade[2];
		int avg = tot/3;	//정수 연산은 정수
		System.out.printf("국어 %d점, 영어 %d점, 수학%d점 \n", grade[0], grade[1], grade[2]);
		System.out.printf("총점 %d점, 평균 %d점", tot, avg);

	}

}
