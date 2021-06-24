package book.twobook.lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		/*
		 * (x,y) -> {
		 * 		if(x >= y) return x;
		 * 		else return y;
		 * }
		 */
		MyNumber max = (x,y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));
		
	}
}
