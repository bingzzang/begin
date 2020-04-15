package basic.ex.collection;

public class MyStudent {
	//HashSet 예제
	
	private String name;
	private int grade;
	
	public MyStudent() {
		this("이순신",2);
	}
	
	public MyStudent(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return "학생 이름은 "+name +", 학년은 "+grade+"학년입니다.";
	}


}
