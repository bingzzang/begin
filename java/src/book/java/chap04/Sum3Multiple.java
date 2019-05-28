package book.java.chap04;

class Sum3Multiple 
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
		Sum3Multiple e1 = new Sum3Multiple();
		e1.m1();
	}
}
