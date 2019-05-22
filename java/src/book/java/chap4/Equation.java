package book.java.chap4;

class Equation 
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
		Equation e3 = new Equation();
		e3.m1();
	}
}
