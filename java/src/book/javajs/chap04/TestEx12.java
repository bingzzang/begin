package book.javajs.chap04;

public class TestEx12 {

	public static void main(String[] args) {
		for(int x=1;x<4;x++) {
			for(int i=2;i<=4;i++) {
				System.out.print(i+"*"+x+"="+(x*i)+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int x=1;x<4;x++) {
			for(int i=5;i<=7;i++) {
				System.out.print(i+"*"+x+"="+(x*i)+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int x=1;x<4;x++) {
			for(int i=8;i<=9;i++) {
				System.out.print(i+"*"+x+"="+(x*i)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		for (int i = 1 ; i <= 9 ; i++) {
			for (int j = 1; j <= 3; j++) {
				int x = j+1+(i-1)/3*3;
				int y = i%3==0? 3 : i%3 ;
				if(x > 9) // 9단까지만 출력한다. 이 코드가 없으면 10단까지 출력된다.
			    break;
				System.out.print(x+"*"+y+"="+x*y+"\t"); //println이 아님에 주의
			}
		System.out.println();
		if(i%3==0) System.out.println();
		}
	}
}
