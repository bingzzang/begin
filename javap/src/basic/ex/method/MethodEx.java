package basic.ex.method;

public class MethodEx {
	int sum = 0;
	String sth = "";
	String sths[] = new String[4];
	
	public void execute2() {
		sths[0] = "r";
		sths[1] = "y";
		sths[2] = "a";
		sths[3] = "n";
		
		make();
		
		System.out.println(sth);
	}
	public void execute() {
		summarize(8);
		System.out.println(sum);
	}
	
	public int summarize(int a) {
		for(int i=0; i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public String make() {
		for(int i=0;i<sths.length;i++) {
			sth +=sths[i];
		}
		return sth;
	}
	public static void main(String[] args) {
		MethodEx me = new MethodEx();
//		me.execute();
		me.execute2();
	}

}
