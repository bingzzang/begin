package book.javajs.chap03;

public class Operator07 {
	public static void main(String[] args) {
		
		int x, y, z;
		int absX, absY, absZ;
		
		char signX, signY, signZ;
		
		x =10;
		y = -5;
		z = 0;
		
		absX  = x>=0 ? x : -x; //10
		absY  = y>=0 ? y : -y; //5
		absZ  = z>=0 ? z : -z; //0
		
		signX = x > 0 ? '+' : (x==0 ? ' ' : '-'); //+
		signY = y > 0 ? '+' : (y==0 ? ' ' : '-');  //-
		signZ = z > 0 ? '+' : (z==0 ? ' ' : '-'); //' '
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.err.printf("z=%c%d%n", signZ, absZ);
	}
}
