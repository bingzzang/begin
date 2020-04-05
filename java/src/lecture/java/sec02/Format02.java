package lecture.java.sec02;

public class Format02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1243);
		System.out.printf("%d\n", 12436);
		
		System.out.println();
		
		//오른쪽 정렬, 5자리 확보
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		System.out.println();
		
		//소수점
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%.3f\n", 1.23);
		
		
	}

}
