package book.twobook.innerclass;

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable r = out.getRunnable(10);
		r.run();
		out.runner.run();
	}
}
