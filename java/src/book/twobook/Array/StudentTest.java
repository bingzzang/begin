package book.twobook.Array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st1 = new Student("1001", "Lee");
		
		st1.addSubject("국어", 100);
		st1.addSubject("수학", 80);
		
		Student st2 = new Student("1002", "Kim");
		
		st2.addSubject("국어", 90);
		st2.addSubject("수학", 95);
		st2.addSubject("영어", 85);
		
		st1.showStudentInfo();
		System.out.println("---------------");
		st2.showStudentInfo();
	}
}
