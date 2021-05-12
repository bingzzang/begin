package book.twobook.Array;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length != 2) {	//입력된 데이터 개수가 2개가 아닐 경우
			System.out.println("값의 수가 부족합니다");
			System.exit(0);; 	//프로그램 강제 종료
		}
		
		String str1 = args[0];
		String str2 = args[1];
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
}
