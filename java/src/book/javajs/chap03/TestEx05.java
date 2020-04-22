package book.javajs.chap03;

public class TestEx05 {
	public static void main(String[] args) {
		//일의 자리를 1로 바꾸는 코드
		//333이면 331
		
		int num = 777;
		int res = num%10;
		
//		System.out.println(res !=1 ? (num-(res-1)): num);
		System.out.println(num/10*10+1);
		/*
		 * int는 나머지를 버림
		 * 777/10 = 77
		 * 77*10 = 770 + 1 = 771
		 * */
	}
}
