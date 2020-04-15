package basic.ex.method;

public class MethodEx4 {
	//참조에 의한 호출(Call by Redference.a
	void increase(int[] n) {
		for(int i=0;i<n.length;i++) {
			n[i]++;
		}
	}
	public static void main(String[] args) {
		int [] ref1 = {100, 800,300};
		
		MethodEx4 m4 = new MethodEx4();
		
		System.out.println("메소드 호출 전");
		for(int i=0;i<ref1.length;i++) {
			System.out.println("ref1["+i+"] : "+ ref1[i]);
		}
		
		m4.increase(ref1);
		System.out.println();
		System.out.println("메소드 호출 후");
		
		for(int i=0;i<ref1.length;i++) {
			System.out.println("ref1["+i+"] : "+ ref1[i]);
		}
	}

}
