package codinglife.c17;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = {"jenny", "rose", "risa", "jisoo"};
		
		for(String name : members) {	// 배열에서 꺼내서 하나씩 name이라는 변수에 담아준다
			System.out.println("* "+name);
		}
	}
}
