package lecture.java.sec03;

public class MainClass {

	public static void main(String[] args) {
		ChildClass child1 = new ChildClass();
		
		child1.name = "Jenny";
		child1.gender = "F";
		child1.age = 5;
		
		child1.getInfo();
		
		System.out.println();
		
		child1.setInfo("Rose", "F", 4);
		child1.getInfo();
	}
}
