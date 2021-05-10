package book.twobook.variable;

public class CastingEx {

	public static void main(String[] args) {
		int iv = 10;
		char cv = 'A';
		
		double dv = 3.3;
		String sv = "B";
		
		double var = (double)iv;
		
		byte var2 = (byte)iv;
		
		int var3 = (int)dv;
		
//		char var4 = (char)sv;
		
		byte bv = 10;
		float fv = 2.5f;
		double dv2 = 2.5;
		
//		byte result = bv+bv; -> int
		
		char c1 = 'a';
		char c2 = (char)(c1 +1);
		System.out.println(c2);
		
		int x = 5;
		int y = 2;
		double result = (double)x/y;
		System.out.println(result);
		
		double dnum = 3.5;
		double dnum2 = 2.7;
		int result2 = (int)(dnum-dnum2);
		
		System.out.println(result2);
	}
}
