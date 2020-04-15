package book.javajs.chap04;

public class TestEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//회문수(palindrome) : 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수 12321 / 13531
		
		int number = 12321;
		int temp = number;
		
		int result = 0; //변수 number를 거꾸로 변환해서 담을 변수
		int count =1;
		
		while(temp !=0) {
			result +=(temp%10)*count;
			temp = temp/10;
			count = count*10;
		}
		
		if(number == result) {
			System.out.println("회문수");
		}else {
			System.out.println("회문수 아님");
		}
	}

}
