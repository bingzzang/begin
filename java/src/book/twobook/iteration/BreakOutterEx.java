package book.twobook.iteration;

public class BreakOutterEx {

	public static void main(String[] args) {
		Outter:for(char upper='A'; upper<='Z';upper++) {
			for(char lower='a'; lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				
				if(lower=='i') break Outter;
			}
		}
	}
}
