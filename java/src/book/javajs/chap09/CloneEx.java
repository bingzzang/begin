package book.javajs.chap09;

public class CloneEx {

	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = (Point)original.clone();
		
		System.out.println(original);
		System.out.println(copy);
		
	}
}
