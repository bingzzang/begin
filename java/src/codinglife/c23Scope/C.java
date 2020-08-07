package codinglife.c23Scope;

class C {

	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);			//지역변수
		System.out.println(this.v); 	//전역변수
	}
}
