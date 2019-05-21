package book.java.chap4;

class Ex2 
{

	//두 개의 주사위 (눈1, 눈2)

	int i, j;

	void m1(){

		while(true){
			i = (int)(Math.random()*6)+1;
			j = (int)(Math.random()*6)+1;

			if(i+j==5){
				System.out.println("("+ i + ","+j+")");
				break;
			}
		}
		
	}

	public static void main(String[] args) 
	{
		Ex2 e2 = new Ex2();
		e2.m1();
	}
}
