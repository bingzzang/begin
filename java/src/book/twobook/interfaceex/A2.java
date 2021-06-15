package book.twobook.interfaceex;

public interface A2 {

	public void a();
	public void b();
	public void c();
	public void d();
	
	default void e() {
		System.out.println("e()");
	}
}
