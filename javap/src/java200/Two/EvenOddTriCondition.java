package java200.Two;

public class EvenOddTriCondition {
	//삼항(?:) 연산자
	public static void main(String[] args) {

		int temp = 99;
		temp = (temp % 2 == 1) ? temp * 3 +1 : temp / 2;
		// 조건식이 true이면 a, false면 b
		System.out.println(temp);

	}

}
