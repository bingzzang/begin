package sum;

public class Evensum {

	public static void main(String args[]) {
		
		int sum = 0;
		int i=0;
		
		/*
		for(int i=0;i<100;i++) {
			i=i+1;
			sum= sum+i;
		} 
		System.out.println(sum);
		*/
		
		while(i<100) {
			i=i+2;
			sum= sum+i;
		}
		System.out.println(sum);
	}
}
