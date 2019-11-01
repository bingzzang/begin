package basic.book.vol2;

public class Someone extends Human{
	
	public Someone(String sex, String name, int age) {
		super(sex, name, age);
	}

	public void work(String job) {	// 오버라이딩
		System.out.println(job+"으로서 20년 가까이 일 하고 있습니다");
	}
	/*
	public void breath() {
		* 부모클래스에서 메소드가 final이기 때문에 오버라이딩이 안됨
	}*/
	//상속예제 자식클래스
	public static void main(String[] args) {
		Someone s = new Someone("Female", "Haley", 56);
		s.walk();
		s.work("Programmer");

	}
	
	

}
