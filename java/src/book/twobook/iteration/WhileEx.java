package book.twobook.iteration;

public class WhileEx {

	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		
		
		while(i<11) {
			
			sum = sum+i;
			i++;
		}
		
		System.out.println(sum);
	}
}
