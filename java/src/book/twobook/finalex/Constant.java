package book.twobook.finalex;

public class Constant {

	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant con = new Constant();
		con.num= 50;
//		con.NUM = 300;
		
		System.out.println(con.num);
		System.out.println(con.NUM);
	}
}
