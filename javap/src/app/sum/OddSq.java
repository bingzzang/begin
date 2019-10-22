package app.sum;

public class OddSq {

	public static void main(String args[]) {
		int n=0;
		int h=0;
		
		while(n<99) {
			n= n+1;
			if(n%2==1) {
				h=h+n*n;
			//	System.out.println(h+"="+h+"+"+n+"*"+n);
			}
		}
		System.out.println(h);
	}
}
