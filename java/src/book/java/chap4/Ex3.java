package book.java.chap4;

class Ex3 
{
	//중첩for문 이용
		//방정식 4x+5y = 60의 모든 해
		//(x, y)의 형태로 충전

//	int x, y;

	void m1(){
		for(int x=1;x<=10; x++){
			for (int y=1; y<=10; y++){
				if(((4*x)+(5*y))==60) {
					System.out.println("("+x+","+y+")");
					break;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		Ex3 e3 = new Ex3();
		e3.m1();
	}
}
