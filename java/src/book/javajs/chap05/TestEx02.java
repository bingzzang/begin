package book.javajs.chap05;

public class TestEx02 {

	public static void main(String[] args) {
		int[][] arr= {
				{5,5,5,5,5},
				{10,10,10},
				{20,20,20,20},
				{30,30}
		};
		
		System.out.println(arr[3].length);
		
		String str = "ABC-DEF";
		String split = "-";
		
		String strs[] = str.split(split);
		
		for (int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
}
