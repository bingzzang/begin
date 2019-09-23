package sum;

public class PmSum {
	
	public static void main(String args[]) {
		int n=0;
		int h=0;
		int sw=0;
		
		while(n<100) {
			n=n+1;
			if(sw==0) {
				h=h+n;
				sw=1;
			}else {
				h=h-n;
				sw=0;
			}
		}
		System.out.println(h);
	}
}
