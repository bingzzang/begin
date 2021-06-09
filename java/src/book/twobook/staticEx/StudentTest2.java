package book.twobook.staticEx;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.getStudentName()+" : "+studentLee.studentId);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.getStudentName()+" : "+studentSon.studentId);
		
	}
}
