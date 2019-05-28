package book.java.chap07;

public class Child extends Parent{

	private int stuno;
	
	
	public Child(String name, int stuno) {
		super(name);	//부모 생성자를 호출해야함
		//this.name =name;
		//super() : 부모의 생성자를 호출
		//부모 클래스에 매개 변수가 있는 생성자만 있다면 자식 생성자에서 반드시 
		//부모 생성자 호출을 위해 super(매개값,..)를 명시적으로 호출해야 한다.
		this.stuno=stuno;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
