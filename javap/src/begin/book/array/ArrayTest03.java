package begin.book.array;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int temp = 0;
		
		System.out.println("###Before Change###");
		for(int a=0;a<num.length;a++) {
			System.out.println("num["+a+"] : "+num[a]);
		}
		
		for(int i=0;i<(num.length-1)/2;i++) {
			temp = num[i];
			num[i] = num[num.length-1-i];
			num[num.length-1-i] = temp;
		}
		
		System.out.println("###After Change###");
		for(int a=0;a<num.length;a++) {
			System.out.println("num["+a+"] : "+num[a]);
		}
		
	}
}
