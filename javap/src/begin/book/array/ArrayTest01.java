package begin.book.array;

public class ArrayTest01 {

	public static void main(String[] args) {
		int [] num;
		int total = 0;
		
		num = new int[10];
		
		for(int i=0; i<num.length;i++) {
			
			int r = (int)(Math.random()*10);
			num[i] = r;
		}
		for(int k=0; k<num.length;k++) {
			System.out.println("num["+k+"] : "+ num[k]);
		}
		System.out.println("-------------");
		for(int j=0; j<num.length;j++) {
			total +=num[j];
		}
		System.out.println("total : " + total);
	}
}
