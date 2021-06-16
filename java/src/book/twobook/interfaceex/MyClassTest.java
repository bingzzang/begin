package book.twobook.interfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mclass = new MyClass();
		 
		X xclass = mclass;
		xclass.x();
		
		Y yclass = mclass;
		yclass.y();
		
		MyInterface iclass = mclass;
		iclass.x();
		iclass.y();
	}
}
