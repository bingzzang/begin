package book.java.chap3;

class Pencils 
{	
	//학생에게 똑같이 연필을 나누어 주려고 한다
	//몇 개씩 나눠줄 수 있는지, 몇 개가 남는지 구하기

	public static void main(String[] args) 
	{
		int pencils = 534;
		int students = 30;
		
	
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
	
		
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
	}
}
