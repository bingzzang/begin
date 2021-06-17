package book.twobook.object;

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		System.out.println(book1);				//인스턴스 정보
		System.out.println(book1.toString());	//toString()으로 인스턴스 정보
	}
}
