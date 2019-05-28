package book.java.chap02;

public class  TestVar
{
	void t1(){
		byte byteValue=10;
		char charValue='A';

		int intVal = byteValue;
		System.out.println(intVal);
		int intVal2 = charValue;
		System.out.println(intVal2);

		short shortVal =(short)charValue;
		System.out.println(shortVal);	//���� ����ȯ

		double doubleVal = byteValue;
		System.out.println(byteValue);

		double d = 10;
		System.out.println(d);

		float f = 10;
		System.out.println(f);

/*		char c ='';		�ȵ�
		System.out.println(c); 

		*/
	}
	public static void main(String[] args) 
	{
		TestVar tv = new TestVar();
		tv.t1();
	}
}
