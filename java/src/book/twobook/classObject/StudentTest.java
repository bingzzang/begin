package book.twobook.classObject;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.studentName = "김자바";
		st2.studentName = "이자바";
		
		System.out.println(st1);
		System.out.println(st2);	//참조 값
		
		System.out.println(st1.studentName);
		System.out.println(st2.studentName);
	}
}
