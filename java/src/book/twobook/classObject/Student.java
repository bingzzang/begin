package book.twobook.classObject;

public class Student {
	
	int studentId;
	String studentName;
	int grade;
	
	public void showStudentInfo(){
		System.out.println(studentName+"("+studentId+", "+grade+")"); 
	}
}
