package book.twobook.Array;

import java.util.ArrayList;

public class Student {

	String stuId;
	String name;
	ArrayList<Subject> subList;
	
	public Student(String stuId, String name) {
		super();
		this.stuId = stuId;
		this.name = name;
		subList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subNm, int subScore) {
		Subject sub = new Subject();
		sub.setSubNm(subNm);
		sub.setSubScore(subScore);
		subList.add(sub);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s:subList) {
			total += s.getSubScore();
			System.out.println("학생 "+name+"의 "+s.getSubNm()+"과목 성적은 "
					+s.getSubScore()+"점 입니다");
		}
		System.out.println("학생 "+name+"의 총점은 "+total+"점 입니다");
	}
}
