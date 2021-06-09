package book.twobook.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		System.out.println(com1==com2);
	}
}
