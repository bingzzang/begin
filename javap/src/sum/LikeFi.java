package sum;

public class LikeFi {

	int k, n, h;
	
	void fun(){
		k= 0 ;
		n= 0;
		h = 0;
		
		while(k<10) {
			k=k+1;
	//		System.out.println(k);
			n=n+k;
	//		System.out.println(n);
			h=h+n;
	//		System.out.println(h);
	//		System.out.println("-----------------");
		}
		System.out.println(h);
	}
	public static void main(String args[]) {
		LikeFi lf = new LikeFi();
		lf.fun();
	}
}
