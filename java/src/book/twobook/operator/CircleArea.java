package book.twobook.operator;

public class CircleArea {

	public static void main(String[] args) {
		int var = 10;
		String var2 = "3";
		String var3 = "14";
		
		double var4 = var * var * Double.parseDouble(var2+"."+var3);
		System.out.println("원의 넓이 : "+var4);
	}
}
