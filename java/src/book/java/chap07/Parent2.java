package book.java.chap07;

public class Parent2 {

	public String nation;
	
	public Parent2() {
		this("한국");
		System.out.println("Parent2() call");
	}
	public Parent2(String nation) {
		this.nation=nation;
		System.out.println("Parent2(String nation) call");
	}
}
