package book.twobook.object;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(17,06,2017);
		MyDate date2 = new MyDate(17,06,2017);
		MyDate date3 = new MyDate(17,06,2021);
		
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		System.out.println(date3.toString());
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.equals(date3));
	}
}
