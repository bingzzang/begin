package book.java.chap4;

class Ex4 
{
	//for문 이용
	//별찍기
	/*
	*
	**
	***
	****
	*****
	*/

	void m1(){
		String star = "*";

		for (int i = 1; i<6; i++){
			for(int j=1;j<=i;j++){
				
				System.out.print(star);
			}System.out.println("");
		}	
	}

	public static void main(String[] args) 
	{
		Ex4 e4 = new Ex4();
		e4.m1();
	}
}
