package codinglife.c17Array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		
		String[] members = {"Tom", "Jessie", "Rosie"};
		
		for(int i=0; i<members.length;i++) {
			String member = members[i];
			System.out.println(member+" -- consulting complete");
		}
	}
}
