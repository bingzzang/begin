package book.twobook.classObject;

public class Student {
	
	String studentId;
	String studentName;
	int grade;
	
	
	public Student(String studentId, String studentName, int grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}


	public void showStudentInfo(){
		System.out.println(studentName+"("+studentId+", "+grade+")"); 
	}
}
