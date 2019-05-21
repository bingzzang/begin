package book.java.chap4;

class Ex1 
{
	//1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드.

	int sum;

	void m1(){
		
		for (int i=1;i<=100 ;i++ ){
			if(i%3==0){
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		Ex1 e1 = new Ex1();
		e1.m1();
	}
}
