package basic.book.vol2;

public class Someone extends Human{
	
	public Someone(String sex, String name, int age) {
		super(sex, name, age);
	}

	//상속예제 자식클래스
	public static void main(String[] args) {
		Someone s = new Someone("Female", "Haley", 26);
		s.walk();
		s.work("Programmer");

	}

}
