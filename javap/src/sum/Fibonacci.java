package sum;

public class Fibonacci {
	
	int k,n,h;
	
	void fun() {
		k=0;
		n=1;
		h=1;
		
		while(k<9) {
			k=k+1;
			n=n+k;
			h=h+n;
		}
		System.out.println(h);
	}
	
	public static void main(String args[]) {
		Fibonacci fi = new Fibonacci();
		fi.fun();
	}
}
