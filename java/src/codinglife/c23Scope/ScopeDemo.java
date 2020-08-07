package codinglife.c23Scope;

class ScopeDemo {

	static void a() {
		int i = 0;
	}
	
	public static void main(String[] args) {
		for (int i=0;i<5;i++) {
			a();	//영향을 끼치지 않음
			System.out.println(i);
		}
	}
}
