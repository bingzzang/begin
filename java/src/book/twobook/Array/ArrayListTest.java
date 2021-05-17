package book.twobook.Array;

import java.util.ArrayList;

import book.twobook.classObject.Student;


public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		array.add(new Student("1001", "tomas", 1));
		array.add(new Student("1002", "james", 3));
		array.add(new Student("1003", "edward", 4));
		
		for(int i=0; i<array.size();i++) {
			array.get(i).showStudentInfo();
		}
	}
}
