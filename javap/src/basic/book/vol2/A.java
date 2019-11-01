package basic.book.vol2;

public class A {

	A(){
		System.out.println("A의 인수 0의 생성자입니다");

	}
	A(int a){
		System.out.println("A의 인수 1의 생성자입니다");
	}
}

class B extends A{
	B(){
		System.out.println("B의 인수 0의 생성자입니다");
	}
	
	B(int b){
		super(b);
		System.out.println("B의 인수 1의 생성자입니다.");
	}
}



